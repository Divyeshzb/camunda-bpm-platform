package org.camunda.bpm.engine.rest.hal;

import org.camunda.bpm.engine.rest.ExecutionRestService;
import org.camunda.bpm.engine.runtime.VariableInstance;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class HalVariableValue_generateExecutionVariableValue_f456fc55a8_Test {

    @Mock
    private VariableInstance variableInstance;

    private String executionId = "testExecutionId";

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGenerateExecutionVariableValue_Success() {
        HalVariableValue expectedValue = HalVariableValue.fromVariableInstance(variableInstance)
                .link(HalVariableValue.REL_SELF, ExecutionRestService.PATH, executionId, "localVariables");

        when(variableInstance.getName()).thenReturn("variableName");
        when(variableInstance.getTypeName()).thenReturn("typeName");
        when(variableInstance.getValue()).thenReturn("value");

        HalVariableValue actualValue = HalVariableValue.generateExecutionVariableValue(variableInstance, executionId);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testGenerateExecutionVariableValue_Failure() {
        HalVariableValue expectedValue = HalVariableValue.fromVariableInstance(variableInstance)
                .link(HalVariableValue.REL_SELF, ExecutionRestService.PATH, executionId, "localVariables");

        when(variableInstance.getName()).thenReturn(null);
        when(variableInstance.getTypeName()).thenReturn(null);
        when(variableInstance.getValue()).thenReturn(null);

        HalVariableValue actualValue = HalVariableValue.generateExecutionVariableValue(variableInstance, executionId);

        assertEquals(expectedValue, actualValue);
    }
}
