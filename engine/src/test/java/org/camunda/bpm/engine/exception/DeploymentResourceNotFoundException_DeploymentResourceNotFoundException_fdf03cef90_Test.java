package org.camunda.bpm.engine.exception;

import org.camunda.bpm.engine.ProcessEngineException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DeploymentResourceNotFoundException_DeploymentResourceNotFoundException_fdf03cef90_Test {

    private String message;
    private Throwable cause;

    @BeforeEach
    public void setUp() {
        message = "Resource not found"; // TODO: Change the message as per the scenario
        cause = new ProcessEngineException("Process Engine Exception"); // TODO: Change the exception as per the scenario
    }

    @Test
    public void testDeploymentResourceNotFoundException_Success() {
        DeploymentResourceNotFoundException exception = new DeploymentResourceNotFoundException();
        exception.setMessage(message);
        exception.setCause(cause);
        assertEquals(message, exception.getMessage());
        assertEquals(cause, exception.getCause());
    }

    @Test
    public void testDeploymentResourceNotFoundException_NullMessage() {
        DeploymentResourceNotFoundException exception = new DeploymentResourceNotFoundException();
        exception.setCause(cause);
        assertNull(exception.getMessage());
        assertEquals(cause, exception.getCause());
    }

    @Test
    public void testDeploymentResourceNotFoundException_NullCause() {
        DeploymentResourceNotFoundException exception = new DeploymentResourceNotFoundException();
        exception.setMessage(message);
        assertEquals(message, exception.getMessage());
        assertNull(exception.getCause());
    }

    @Test
    public void testDeploymentResourceNotFoundException_NullMessageAndCause() {
        DeploymentResourceNotFoundException exception = new DeploymentResourceNotFoundException();
        assertNull(exception.getMessage());
        assertNull(exception.getCause());
    }
}
