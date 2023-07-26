package org.camunda.bpm.dmn.engine.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.camunda.bpm.dmn.engine.DmnDecisionTableResult;
import org.camunda.bpm.engine.variable.Variables;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class DefaultDmnEngine_evaluateDecisionTable_38e4626bff_Test {

    @InjectMocks
    private DefaultDmnEngine defaultDmnEngine = new DefaultDmnEngine();

    @Mock
    private DmnDecisionTableResult decisionTableResult;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testEvaluateDecisionTable_Success() {
        String decisionKey = "testDecisionKey";
        InputStream inputStream = mock(InputStream.class);
        Map<String, Object> variables = new HashMap<>();
        variables.put("testVar", "testValue");

        when(defaultDmnEngine.evaluateDecisionTable(decisionKey, inputStream, Variables.fromMap(variables).asVariableContext())).thenReturn(decisionTableResult);

        DmnDecisionTableResult result = defaultDmnEngine.evaluateDecisionTable(decisionKey, inputStream, variables);
        assertEquals(decisionTableResult, result);
    }

    @Test
    public void testEvaluateDecisionTable_NullVariables() {
        String decisionKey = "testDecisionKey";
        InputStream inputStream = mock(InputStream.class);

        assertThrows(IllegalArgumentException.class, () -> {
            defaultDmnEngine.evaluateDecisionTable(decisionKey, inputStream, null);
        });
    }
}
