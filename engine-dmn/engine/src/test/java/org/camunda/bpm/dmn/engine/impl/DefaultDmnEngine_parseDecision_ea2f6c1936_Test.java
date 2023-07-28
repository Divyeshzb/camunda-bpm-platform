package org.camunda.bpm.dmn.engine.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.camunda.bpm.dmn.engine.DmnDecision;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class DefaultDmnEngine_parseDecision_ea2f6c1936_Test {

    @InjectMocks
    private DefaultDmnEngine defaultDmnEngine;

    @Mock
    private DmnDecision dmnDecision;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testParseDecision_success() {
        String decisionKey = "decisionKey1";
        InputStream inputStream = mock(InputStream.class);

        List<DmnDecision> decisions = new ArrayList<>();
        decisions.add(dmnDecision);

        when(dmnDecision.getKey()).thenReturn(decisionKey);
        when(defaultDmnEngine.parseDecisions(inputStream)).thenReturn(decisions);

        DmnDecision result = defaultDmnEngine.parseDecision(decisionKey, inputStream);

        assertNotNull(result);
        assertEquals(decisionKey, result.getKey());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDecision_failure() {
        String decisionKey = "decisionKey2";
        InputStream inputStream = mock(InputStream.class);

        List<DmnDecision> decisions = new ArrayList<>();
        decisions.add(dmnDecision);

        when(dmnDecision.getKey()).thenReturn("differentKey");
        when(defaultDmnEngine.parseDecisions(inputStream)).thenReturn(decisions);

        defaultDmnEngine.parseDecision(decisionKey, inputStream);
    }
}
