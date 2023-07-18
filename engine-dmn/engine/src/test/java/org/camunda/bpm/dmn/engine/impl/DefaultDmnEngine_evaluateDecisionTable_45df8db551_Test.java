// Test generated by RoostGPT for test Camunda-engine-dmn using AI Type Open AI and AI Model gpt-4

package org.camunda.bpm.dmn.engine.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.camunda.bpm.dmn.engine.DmnDecision;
import org.camunda.bpm.dmn.engine.DmnDecisionTableResult;
import org.camunda.bpm.engine.variable.context.VariableContext;
import org.camunda.bpm.model.dmn.DmnModelInstance;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class DefaultDmnEngine_evaluateDecisionTable_45df8db551_Test {

    private DefaultDmnEngine defaultDmnEngine;
    private DmnModelInstance dmnModelInstance;
    private VariableContext variableContext;

    @Before
    public void setUp() {
        defaultDmnEngine = new DefaultDmnEngine();
        dmnModelInstance = mock(DmnModelInstance.class);
        variableContext = mock(VariableContext.class);
    }

    @Test
    public void testEvaluateDecisionTable_Success() {
        String decisionKey = "decisionKey1";
        DmnDecision decision = mock(DmnDecision.class);
        when(decision.getKey()).thenReturn(decisionKey);

        List<DmnDecision> decisions = new ArrayList<>();
        decisions.add(decision);

        when(defaultDmnEngine.parseDecisions(dmnModelInstance)).thenReturn(decisions);
        DmnDecisionTableResult result = defaultDmnEngine.evaluateDecisionTable(decisionKey, dmnModelInstance, variableContext);

        assertNotNull(result);
        assertEquals(decisionKey, result.getDecision().getKey());
    }

    @Test(expected = DmnEngineException.class)
    public void testEvaluateDecisionTable_Failure() {
        String decisionKey = "decisionKey2";
        List<DmnDecision> decisions = new ArrayList<>();

        when(defaultDmnEngine.parseDecisions(dmnModelInstance)).thenReturn(decisions);
        defaultDmnEngine.evaluateDecisionTable(decisionKey, dmnModelInstance, variableContext);
    }
}
