// Test generated by RoostGPT for test Camunda-engine-dmn using AI Type Open AI and AI Model gpt-4

package org.camunda.bpm.dmn.engine.impl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.util.HashMap;
import java.util.Map;

import org.camunda.bpm.dmn.engine.DmnDecision;
import org.camunda.bpm.dmn.engine.DmnDecisionTableResult;
import org.camunda.bpm.engine.variable.Variables;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultDmnEngine_evaluateDecisionTable_864748667b_Test {

    @InjectMocks
    private DefaultDmnEngine defaultDmnEngine;

    @Mock
    private DmnDecision decision;

    private Map<String, Object> variables;

    @Before
    public void setUp() {
        variables = new HashMap<>();
        variables.put("key1", "value1");
        variables.put("key2", "value2");
    }

    @Test
    public void testEvaluateDecisionTable_success() {
        DmnDecisionTableResult expected = mock(DmnDecisionTableResult.class);
        when(defaultDmnEngine.evaluateDecisionTable(decision, Variables.fromMap(variables).asVariableContext())).thenReturn(expected);

        DmnDecisionTableResult actual = defaultDmnEngine.evaluateDecisionTable(decision, variables);

        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEvaluateDecisionTable_decisionNull() {
        defaultDmnEngine.evaluateDecisionTable(null, variables);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEvaluateDecisionTable_variablesNull() {
        defaultDmnEngine.evaluateDecisionTable(decision, null);
    }
}
