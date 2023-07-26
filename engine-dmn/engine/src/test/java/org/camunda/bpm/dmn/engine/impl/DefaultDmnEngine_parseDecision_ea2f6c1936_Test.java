package org.camunda.bpm.dmn.engine.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.camunda.bpm.dmn.engine.DmnDecision;
import org.camunda.bpm.dmn.engine.impl.spi.transform.DmnTransformer;
import org.junit.Before;
import org.junit.Test;

public class DefaultDmnEngine_parseDecision_ea2f6c1936_Test {

    private DefaultDmnEngine defaultDmnEngine;
    private DmnTransformer transformer;
    private String decisionKey = "decisionKey";
    private InputStream inputStream;

    @Before
    public void setUp() {
        defaultDmnEngine = new DefaultDmnEngine();
        transformer = mock(DmnTransformer.class);
        defaultDmnEngine.setTransformer(transformer);
        inputStream = new ByteArrayInputStream("test data".getBytes());
    }

    @Test
    public void testParseDecision_success() {
        List<DmnDecision> decisions = new ArrayList<>();
        DmnDecision decision = mock(DmnDecision.class);
        when(decision.getKey()).thenReturn(decisionKey);
        decisions.add(decision);

        when(transformer.transformDefinitions(null, inputStream, decisionKey)).thenReturn(decisions);

        DmnDecision result = defaultDmnEngine.parseDecision(decisionKey, inputStream);
        assertNotNull(result);
        assertEquals(decisionKey, result.getKey());
    }

    @Test
    public void testParseDecision_keyNotFound() {
        List<DmnDecision> decisions = new ArrayList<>();
        DmnDecision decision = mock(DmnDecision.class);
        decisions.add(decision);

        when(transformer.transformDefinitions(null, inputStream, decisionKey)).thenReturn(decisions);

        Exception exception = assertThrows(Exception.class, () -> {
            defaultDmnEngine.parseDecision(decisionKey, inputStream);
        });

        String expectedMessage = "Unable to find decision with key";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
}
