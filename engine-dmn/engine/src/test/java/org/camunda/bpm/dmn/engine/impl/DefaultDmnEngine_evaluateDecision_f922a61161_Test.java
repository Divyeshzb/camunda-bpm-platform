package org.camunda.bpm.dmn.engine.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;

import org.camunda.bpm.dmn.engine.DmnDecision;
import org.camunda.bpm.dmn.engine.DmnDecisionResult;
import org.camunda.bpm.engine.variable.Variables;
import org.junit.Before;
import org.junit.Test;

public class DefaultDmnEngine_evaluateDecision_f922a61161_Test {

    private DefaultDmnEngine testInstance;
    private DmnDecision mockDecision;
    private Map<String, Object> variables;

    @Before
    public void setUp() {
        testInstance = new DefaultDmnEngine();
        mockDecision = mock(DmnDecision.class);
        variables = new HashMap<>();
        // TODO: Add necessary variables to map
    }

    @Test
    public void testEvaluateDecision_Success() {
        DmnDecisionResult expectedResult = mock(DmnDecisionResult.class);
        when(mockDecision.evaluateDecision(Variables.fromMap(variables).asVariableContext())).thenReturn(expectedResult);

        DmnDecisionResult actualResult = testInstance.evaluateDecision(mockDecision, variables);

        assertNotNull(actualResult);
        assertEquals(expectedResult, actualResult);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEvaluateDecision_NullDecision() {
        testInstance.evaluateDecision(null, variables);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEvaluateDecision_NullVariables() {
        testInstance.evaluateDecision(mockDecision, null);
    }
}
