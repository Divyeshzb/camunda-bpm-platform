package org.camunda.bpm.engine.exception;

import org.camunda.bpm.engine.ProcessEngineException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DeploymentResourceNotFoundException_DeploymentResourceNotFoundException_53a0c12c25_Test {

    private DeploymentResourceNotFoundException deploymentResourceNotFoundException;

    @BeforeEach
    public void setUp() {
        deploymentResourceNotFoundException = new DeploymentResourceNotFoundException("Test Exception", null);
    }

    @Test
    public void testDeploymentResourceNotFoundException_withCause() {
        Throwable cause = new Throwable("This is a test throwable");
        DeploymentResourceNotFoundException exception = new DeploymentResourceNotFoundException("Test Exception", cause);
        assertEquals("This is a test throwable", exception.getCause().getMessage());
    }

    @Test
    public void testDeploymentResourceNotFoundException_withoutCause() {
        DeploymentResourceNotFoundException exception = new DeploymentResourceNotFoundException("Test Exception", null);
        assertNull(exception.getCause());
    }
}
