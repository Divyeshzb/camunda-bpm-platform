// Test generated by RoostGPT for test Camunda-engine-dmn using AI Type Open AI and AI Model gpt-4

package org.camunda.bpm.dmn.engine.impl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;

import org.camunda.bpm.dmn.engine.DmnDecisionResult;
import org.camunda.bpm.dmn.engine.impl.DefaultDmnEngine;
import org.camunda.bpm.engine.variable.Variables;
import org.camunda.bpm.model.dmn.DmnModelInstance;
import org.junit.Before;
import org.junit.Test;

public class DefaultDmnEngine_evaluateDecision_b06674eed5_Test {

    private DefaultDmnEngine defaultDmnEngine;
    private DmnModelInstance dmnModelInstance;
    private Map<String, Object> variables;
    private DmnDecisionResult dmnDecisionResult;

    @Before
    public void setup() {
        defaultDmnEngine = new DefaultDmnEngine();
        dmnModelInstance = mock(DmnModelInstance.class);
        variables = new HashMap<>();
        dmnDecisionResult = mock(DmnDecisionResult.class);
    }

    @Test
    public void testEvaluateDecision_Success() {
        String decisionKey = "decisionKey1";
        variables.put("key1", "value1");
        when(defaultDmnEngine.evaluateDecision(decisionKey, dmnModelInstance, Variables.fromMap(variables).asVariableContext())).thenReturn(dmnDecisionResult);

        DmnDecisionResult result = defaultDmnEngine.evaluateDecision(decisionKey, dmnModelInstance, variables);

        assertEquals(dmnDecisionResult, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEvaluateDecision_Failure_NullVariables() {
        String decisionKey = "decisionKey2";
        defaultDmnEngine.evaluateDecision(decisionKey, dmnModelInstance, null);
    }
}