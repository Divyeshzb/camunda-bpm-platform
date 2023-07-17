package org.camunda.bpm.engine.rest.hal;

import org.camunda.bpm.engine.rest.*;
import org.camunda.bpm.engine.rest.dto.VariableValueDto;
import org.camunda.bpm.engine.rest.exception.RestException;
import org.camunda.bpm.engine.rest.sub.VariableResource;
import org.camunda.bpm.engine.runtime.VariableInstance;
import javax.ws.rs.core.UriBuilder;
import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class HalVariableValue_generateTaskVariableValue_ffb6d68df1_Test {

    private VariableInstance variableInstance;
    private String taskId;

    @BeforeEach
    public void setUp() {
        variableInstance = mock(VariableInstance.class);
        taskId = "testTaskId";
    }

    @Test
    public void testGenerateTaskVariableValue_success() {
        HalVariableValue result = HalVariableValue.generateTaskVariableValue(variableInstance, taskId);
        assertNotNull(result);
        assertEquals(taskId, result.getTaskId());
    }

    @Test
    public void testGenerateTaskVariableValue_failure() {
        try {
            HalVariableValue.generateTaskVariableValue(null, taskId);
            fail("Should have thrown exception");
        } catch (RestException e) {
            assertEquals("Variable instance cannot be null", e.getMessage());
        }
    }
}
