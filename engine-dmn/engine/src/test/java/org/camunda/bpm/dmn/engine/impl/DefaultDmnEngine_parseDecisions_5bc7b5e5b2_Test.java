package org.camunda.bpm.dmn.engine.impl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

import org.camunda.bpm.dmn.engine.DmnDecision;
import org.camunda.bpm.dmn.engine.impl.spi.transform.DmnTransformer;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class DefaultDmnEngine_parseDecisions_5bc7b5e5b2_Test {

    @Mock
    private DmnTransformer transformer;

    @Mock
    private DmnDecision decision1, decision2;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testParseDecisionsSuccess() {
        InputStream inputStream = mock(InputStream.class);
        when(transformer.createTransform().modelInstance(inputStream).transformDecisions())
                .thenReturn(Arrays.asList(decision1, decision2));

        List<DmnDecision> result = new DefaultDmnEngine().parseDecisions(inputStream);

        assertEquals(2, result.size());
        assertEquals(Arrays.asList(decision1, decision2), result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDecisionsNullInputStream() {
        new DefaultDmnEngine().parseDecisions(null);
    }
}
