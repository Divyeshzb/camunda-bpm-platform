package org.camunda.bpm.engine.exception;

import org.camunda.bpm.engine.ProcessEngineException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DeploymentResourceNotFoundException_DeploymentResourceNotFoundException_fdf03cef90_Test {

    @Test
    public void testDeploymentResourceNotFoundException_WithMessage() {
        DeploymentResourceNotFoundException exception = new DeploymentResourceNotFoundException();
        assertNull(exception.getMessage());
        assertNull(exception.getCause());
    }

    @Test
    public void testDeploymentResourceNotFoundException_WithMessageAndCause() {
        DeploymentResourceNotFoundException exception = new DeploymentResourceNotFoundException();
        assertNull(exception.getMessage());
        assertNull(exception.getCause());
    }
}
