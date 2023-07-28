package org.camunda.bpm.dmn.engine.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.camunda.bpm.dmn.engine.DmnDecisionResult;
import org.camunda.bpm.engine.variable.Variables;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class DefaultDmnEngine_evaluateDecision_1d50e95531_Test {

    DefaultDmnEngine defaultDmnEngine;

    @Mock
    InputStream inputStream;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        defaultDmnEngine = new DefaultDmnEngine();
    }

    @Test
    public void testEvaluateDecision_success() {
        Map<String, Object> variables = new HashMap<>();
        variables.put("key1", "value1");
        variables.put("key2", "value2");

        DmnDecisionResult mockResult = mock(DmnDecisionResult.class);
        when(defaultDmnEngine.evaluateDecision(anyString(), any(InputStream.class), any(VariableContext.class))).thenReturn(mockResult);

        DmnDecisionResult result = defaultDmnEngine.evaluateDecision("decisionKey", inputStream, Variables.fromMap(variables).asVariableContext());

        verify(defaultDmnEngine, times(1)).evaluateDecision("decisionKey", inputStream, Variables.fromMap(variables).asVariableContext());
        assertEquals(mockResult, result);
    }

    @Test
    public void testEvaluateDecision_nullVariables_failure() {
        assertThrows(IllegalArgumentException.class, () -> {
            defaultDmnEngine.evaluateDecision("decisionKey", inputStream, null);
        });
    }
}
