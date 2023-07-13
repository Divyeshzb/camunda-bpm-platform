package org.camunda.bpm.engine.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.camunda.bpm.engine.ProcessEngineException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DeploymentResourceNotFoundException_DeploymentResourceNotFoundException_fdf03cef90_Test {

    private String testMessage;
  
    @BeforeEach
    public void setup() {
        testMessage = "Test Message";
    }

    @Test
    public void testDeploymentResourceNotFoundExceptionSuccess() {
        DeploymentResourceNotFoundException exception = new DeploymentResourceNotFoundException(testMessage);
        assertEquals(testMessage, exception.getMessage());
    }

    @Test
    public void testDeploymentResourceNotFoundExceptionFailure() {
        assertThrows(DeploymentResourceNotFoundException.class, () -> {
            throw new DeploymentResourceNotFoundException(testMessage);
        });
    }
}
