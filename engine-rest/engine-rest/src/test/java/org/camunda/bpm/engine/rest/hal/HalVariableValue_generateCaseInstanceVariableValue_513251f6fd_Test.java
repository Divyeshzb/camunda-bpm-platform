package org.camunda.bpm.engine.rest.hal;

import org.camunda.bpm.engine.rest.CaseInstanceRestService;
import org.camunda.bpm.engine.rest.dto.VariableValueDto;
import org.camunda.bpm.engine.rest.exception.RestException;
import org.camunda.bpm.engine.rest.sub.VariableResource;
import org.camunda.bpm.engine.runtime.VariableInstance;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class HalVariableValue_generateCaseInstanceVariableValue_513251f6fd_Test {

    @Mock
    VariableInstance variableInstance;

    @InjectMocks
    HalVariableValue halVariableValue;

    private String caseInstanceId;

    @BeforeEach
    public void setup() {
        caseInstanceId = "test-case-instance-id";
    }

    @Test
    public void testGenerateCaseInstanceVariableValue_success() {
        when(variableInstance.getName()).thenReturn("test-variable");
        HalVariableValue result = HalVariableValue.generateCaseInstanceVariableValue(variableInstance, caseInstanceId);
        assertEquals("test-variable", result.getName());
    }

    @Test
    public void testGenerateCaseInstanceVariableValue_failure() {
        when(variableInstance.getName()).thenReturn(null);
        try {
            HalVariableValue.generateCaseInstanceVariableValue(variableInstance, caseInstanceId);
        } catch (RestException e) {
            assertEquals("Variable name cannot be null", e.getMessage());
        }
    }
}
