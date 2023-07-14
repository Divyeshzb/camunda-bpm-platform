package org.camunda.bpm.engine.exception;

import org.camunda.bpm.engine.ProcessEngineException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DeploymentResourceNotFoundException_DeploymentResourceNotFoundException_9b518e6a39_Test {

    private String message;

    @BeforeEach
    public void setUp() {
        message = "Test Exception Message";
    }

    @Test
    public void testDeploymentResourceNotFoundException() {
        DeploymentResourceNotFoundException exception = assertThrows(DeploymentResourceNotFoundException.class, () -> {
            throw new DeploymentResourceNotFoundException();
        });

        assertEquals(null, exception.getMessage());
    }

    @Test
    public void testDeploymentResourceNotFoundExceptionWithNullMessage() {
        DeploymentResourceNotFoundException exception = assertThrows(DeploymentResourceNotFoundException.class, () -> {
            throw new DeploymentResourceNotFoundException();
        });

        assertEquals(null, exception.getMessage());
    }
}
