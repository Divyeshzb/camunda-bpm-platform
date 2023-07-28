package org.camunda.bpm.dmn.engine.impl;

import org.camunda.bpm.dmn.engine.DmnDecision;
import org.camunda.bpm.dmn.engine.DmnDecisionResult;
import org.camunda.bpm.engine.variable.VariableMap;
import org.camunda.bpm.engine.variable.Variables;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

public class DefaultDmnDecisionContext_addResultToVariableContext_3d0a11a9a8_Test {

    @Test
    public void testAddResultToVariableContext_emptyResultList() {
        DmnDecisionResult evaluatedResult = Mockito.mock(DmnDecisionResult.class);
        VariableMap variableMap = Variables.createVariables();
        DmnDecision evaluatedDecision = Mockito.mock(DmnDecision.class);

        when(evaluatedResult.getResultList()).thenReturn(Collections.emptyList());

        addResultToVariableContext(evaluatedResult, variableMap, evaluatedDecision);

        assertTrue(variableMap.isEmpty());
    }

    @Test
    public void testAddResultToVariableContext_singleResultList() {
        DmnDecisionResult evaluatedResult = Mockito.mock(DmnDecisionResult.class);
        VariableMap variableMap = Variables.createVariables();
        DmnDecision evaluatedDecision = Mockito.mock(DmnDecision.class);
        Map<String, Object> singleResult = new HashMap<>();
        singleResult.put("key", "value");

        when(evaluatedResult.getResultList()).thenReturn(Collections.singletonList(singleResult));
        when(evaluatedResult.getSingleResult()).thenReturn(singleResult);

        addResultToVariableContext(evaluatedResult, variableMap, evaluatedDecision);

        assertEquals("value", variableMap.get("key"));
    }

    @Test
    public void testAddResultToVariableContext_multipleResultList() {
        DmnDecisionResult evaluatedResult = Mockito.mock(DmnDecisionResult.class);
        VariableMap variableMap = Variables.createVariables();
        DmnDecision evaluatedDecision = Mockito.mock(DmnDecision.class);
        Map<String, Object> result1 = new HashMap<>();
        result1.put("key", "value1");
        Map<String, Object> result2 = new HashMap<>();
        result2.put("key", "value2");
        List<Map<String, Object>> resultList = Arrays.asList(result1, result2);

        when(evaluatedResult.getResultList()).thenReturn(resultList);
        when(evaluatedResult.collectEntries("key")).thenReturn(Arrays.asList("value1", "value2"));

        addResultToVariableContext(evaluatedResult, variableMap, evaluatedDecision);

        assertEquals(Arrays.asList("value1", "value2"), variableMap.get("key"));
    }
}
