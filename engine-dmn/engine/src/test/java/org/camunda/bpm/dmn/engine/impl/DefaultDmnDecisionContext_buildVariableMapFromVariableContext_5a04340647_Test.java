package org.camunda.bpm.dmn.engine.impl;

import org.camunda.bpm.engine.variable.VariableMap;
import org.camunda.bpm.engine.variable.Variables;
import org.camunda.bpm.engine.variable.context.VariableContext;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class DefaultDmnDecisionContext_buildVariableMapFromVariableContext_5a04340647_Test {

    @Mock
    VariableContext variableContext;

    @BeforeEach
    void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testBuildVariableMapFromVariableContext_withValidContext() {
        Set<String> variables = new HashSet<>();
        variables.add("var1");
        variables.add("var2");

        when(variableContext.keySet()).thenReturn(variables);
        when(variableContext.resolve("var1")).thenReturn("value1");
        when(variableContext.resolve("var2")).thenReturn("value2");

        VariableMap result = buildVariableMapFromVariableContext(variableContext);

        assertEquals("value1", result.getValue("var1"));
        assertEquals("value2", result.getValue("var2"));
    }

    @Test
    void testBuildVariableMapFromVariableContext_withEmptyContext() {
        Set<String> variables = new HashSet<>();

        when(variableContext.keySet()).thenReturn(variables);

        VariableMap result = buildVariableMapFromVariableContext(variableContext);

        assertEquals(0, result.size());
    }

    VariableMap buildVariableMapFromVariableContext(VariableContext variableContext) {

        VariableMap variableMap = Variables.createVariables();

        Set<String> variables = variableContext.keySet();
        for(String variable: variables) {
            variableMap.put(variable, variableContext.resolve(variable));
        }

        return variableMap;
    }
}
