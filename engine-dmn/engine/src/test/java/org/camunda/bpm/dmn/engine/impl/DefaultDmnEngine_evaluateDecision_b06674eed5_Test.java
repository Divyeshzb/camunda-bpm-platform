package org.camunda.bpm.dmn.engine.impl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.util.HashMap;
import java.util.Map;

import org.camunda.bpm.dmn.engine.DmnDecisionResult;
import org.camunda.bpm.engine.variable.context.VariableContext;
import org.camunda.bpm.engine.variable.Variables;
import org.camunda.bpm.model.dmn.DmnModelInstance;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DefaultDmnEngine_evaluateDecision_b06674eed5_Test {

    private DefaultDmnEngine defaultDmnEngine;
    private DmnModelInstance dmnModelInstance;
    private Map<String, Object> variables;

    @Before
    public void setUp() {
        defaultDmnEngine = mock(DefaultDmnEngine.class);
        dmnModelInstance = mock(DmnModelInstance.class);
        variables = new HashMap<>();
    }

    @Test
    public void testEvaluateDecision_success() {
        String decisionKey = "decisionKey";
        DmnDecisionResult expectedResult = mock(DmnDecisionResult.class);

        when(defaultDmnEngine.evaluateDecision(eq(decisionKey), eq(dmnModelInstance), any(VariableContext.class))).thenReturn(expectedResult);

        DmnDecisionResult actualResult = defaultDmnEngine.evaluateDecision(decisionKey, dmnModelInstance, Variables.putValueMap(variables));

        verify(defaultDmnEngine, times(1)).evaluateDecision(eq(decisionKey), eq(dmnModelInstance), any(VariableContext.class));
        assertEquals(expectedResult, actualResult);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEvaluateDecision_nullVariables() {
        String decisionKey = "decisionKey";
        defaultDmnEngine.evaluateDecision(decisionKey, dmnModelInstance, null);
    }
}
