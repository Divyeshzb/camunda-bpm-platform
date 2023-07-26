package org.camunda.bpm.dmn.engine.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.camunda.bpm.dmn.engine.DmnDecision;
import org.camunda.bpm.dmn.engine.DmnEngineException;
import org.camunda.bpm.model.dmn.DmnModelInstance;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class DefaultDmnEngine_parseDecision_8027b113e0_Test {

    @Mock
    private DmnModelInstance dmnModelInstance;

    private DefaultDmnEngine defaultDmnEngine;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        defaultDmnEngine = new DefaultDmnEngine();
    }

    @Test
    public void testParseDecision_Success() {
        String decisionKey = "decision1";
        DmnDecision decision1 = mock(DmnDecision.class);
        when(decision1.getKey()).thenReturn(decisionKey);
        List<DmnDecision> decisions = Arrays.asList(decision1);
        when(defaultDmnEngine.parseDecisions(dmnModelInstance)).thenReturn(decisions);

        DmnDecision result = defaultDmnEngine.parseDecision(decisionKey, dmnModelInstance);

        assertNotNull(result);
        assertEquals(decisionKey, result.getKey());
    }

    @Test(expected = DmnEngineException.class)
    public void testParseDecision_Failure() {
        String decisionKey = "decision1";
        DmnDecision decision1 = mock(DmnDecision.class);
        when(decision1.getKey()).thenReturn("decision2");
        List<DmnDecision> decisions = Arrays.asList(decision1);
        when(defaultDmnEngine.parseDecisions(dmnModelInstance)).thenReturn(decisions);

        defaultDmnEngine.parseDecision(decisionKey, dmnModelInstance);
    }
}
