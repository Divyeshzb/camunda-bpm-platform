package org.camunda.bpm.engine.exception;

import org.camunda.bpm.engine.ProcessEngineException;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class DeploymentResourceNotFoundException_DeploymentResourceNotFoundException_53a0c12c25_Test {

    @Test
    public void testDeploymentResourceNotFoundException_WithCause() {
        Throwable cause = new Throwable("This is a test cause");
        DeploymentResourceNotFoundException exception = new DeploymentResourceNotFoundException("Test message", cause);

        assertTrue(exception.getCause() instanceof Throwable);
        assertEquals("This is a test cause", exception.getCause().getMessage());
    }

    @Test
    public void testDeploymentResourceNotFoundException_WithoutCause() {
        DeploymentResourceNotFoundException exception = new DeploymentResourceNotFoundException("Test message");

        assertNull(exception.getCause());
    }
}
