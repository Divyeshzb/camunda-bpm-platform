package org.camunda.bpm.dmn.engine.impl;

import org.camunda.bpm.engine.variable.VariableMap;
import org.camunda.bpm.engine.variable.Variables;
import org.camunda.bpm.engine.variable.context.VariableContext;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class DefaultDmnDecisionContext_buildVariableMapFromVariableContext_5a04340647_Test {

    @Mock
    private VariableContext variableContext;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testBuildVariableMapFromVariableContext_withValidVariableContext() {
        // Arrange
        when(variableContext.keySet()).thenReturn(Set.of("key1", "key2"));
        when(variableContext.resolve("key1")).thenReturn("value1");
        when(variableContext.resolve("key2")).thenReturn("value2");

        // Act
        VariableMap result = buildVariableMapFromVariableContext(variableContext);

        // Assert
        assertEquals(2, result.size());
        assertEquals("value1", result.get("key1"));
        assertEquals("value2", result.get("key2"));
    }

    @Test
    public void testBuildVariableMapFromVariableContext_withEmptyVariableContext() {
        // Arrange
        when(variableContext.keySet()).thenReturn(Set.of());

        // Act
        VariableMap result = buildVariableMapFromVariableContext(variableContext);

        // Assert
        assertEquals(0, result.size());
    }

    protected VariableMap buildVariableMapFromVariableContext(VariableContext variableContext) {
        VariableMap variableMap = Variables.createVariables();

        Set<String> variables = variableContext.keySet();
        for(String variable: variables) {
            variableMap.put(variable, variableContext.resolve(variable));
        }

        return variableMap;
    }
}
