package org.camunda.bpm.dmn.engine.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.camunda.bpm.dmn.engine.DmnDecisionTableResult;
import org.camunda.bpm.engine.variable.Variables;
import org.camunda.bpm.model.dmn.DmnModelInstance;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;

public class DefaultDmnEngine_evaluateDecisionTable_c3eff7a55d_Test {

    private DefaultDmnEngine defaultDmnEngine;
    private DmnModelInstance dmnModelInstanceMock;
    private DmnDecisionTableResult dmnDecisionTableResultMock;

    @BeforeEach
    public void setup() {
        defaultDmnEngine = new DefaultDmnEngine();
        dmnModelInstanceMock = mock(DmnModelInstance.class);
        dmnDecisionTableResultMock = mock(DmnDecisionTableResult.class);
    }

    @Test
    public void testEvaluateDecisionTable_withValidInput() {
        Map<String, Object> variables = new HashMap<>();
        variables.put("key1", "value1");
        variables.put("key2", "value2");
        String decisionKey = "decisionKey";

        when(defaultDmnEngine.evaluateDecisionTable(decisionKey, dmnModelInstanceMock, Variables.fromMap(variables).asVariableContext()))
                .thenReturn(dmnDecisionTableResultMock);

        DmnDecisionTableResult result = defaultDmnEngine.evaluateDecisionTable(decisionKey, dmnModelInstanceMock, variables);

        assertEquals(dmnDecisionTableResultMock, result);
    }

    @Test
    public void testEvaluateDecisionTable_withNullVariables() {
        Map<String, Object> variables = null;
        String decisionKey = "decisionKey";

        assertThrows(IllegalArgumentException.class, () -> defaultDmnEngine.evaluateDecisionTable(decisionKey, dmnModelInstanceMock, variables));
    }
}
