package org.camunda.bpm.dmn.engine.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.camunda.bpm.dmn.engine.DmnDecision;
import org.camunda.bpm.dmn.engine.DmnDecisionResult;
import org.camunda.bpm.engine.variable.context.VariableContext;
import org.camunda.bpm.model.dmn.DmnModelInstance;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DefaultDmnEngine_evaluateDecision_d40b139e89_Test {

    private DefaultDmnEngine defaultDmnEngine;
    private DmnModelInstance dmnModelInstance;
    private VariableContext variableContext;
    private DmnDecision decision;
    private DmnDecisionResult decisionResult;

    @BeforeEach
    public void setUp() {
        defaultDmnEngine = new DefaultDmnEngine();
        dmnModelInstance = mock(DmnModelInstance.class);
        variableContext = mock(VariableContext.class);
        decision = mock(DmnDecision.class);
        decisionResult = mock(DmnDecisionResult.class);
    }

    @Test
    public void testEvaluateDecision_Success() {
        String decisionKey = "decisionKey";
        when(decision.getKey()).thenReturn(decisionKey);
        List<DmnDecision> decisions = Arrays.asList(decision);
        when(defaultDmnEngine.parseDecisions(dmnModelInstance)).thenReturn(decisions);
        when(defaultDmnEngine.evaluateDecision(decision, variableContext)).thenReturn(decisionResult);

        DmnDecisionResult result = defaultDmnEngine.evaluateDecision(decisionKey, dmnModelInstance, variableContext);

        assertEquals(decisionResult, result);
    }

    @Test
    public void testEvaluateDecision_Failure() {
        String decisionKey = "decisionKey";
        when(decision.getKey()).thenReturn("wrongKey");
        List<DmnDecision> decisions = Arrays.asList(decision);
        when(defaultDmnEngine.parseDecisions(dmnModelInstance)).thenReturn(decisions);

        Exception exception = assertThrows(RuntimeException.class, () -> {
            defaultDmnEngine.evaluateDecision(decisionKey, dmnModelInstance, variableContext);
        });

        String expectedMessage = "Unable to find decision with key: " + decisionKey;
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }
}
