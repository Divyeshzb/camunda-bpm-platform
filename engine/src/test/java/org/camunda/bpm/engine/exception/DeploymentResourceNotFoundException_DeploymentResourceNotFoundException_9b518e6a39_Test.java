package org.camunda.bpm.engine.exception;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DeploymentResourceNotFoundException_DeploymentResourceNotFoundException_9b518e6a39_Test {

    @Test
    public void testDeploymentResourceNotFoundExceptionWithValidMessage() {
        DeploymentResourceNotFoundException exception = new DeploymentResourceNotFoundException();
        assertNull(exception.getMessage());
    }

    @Test
    public void testDeploymentResourceNotFoundExceptionWithNullMessage() {
        DeploymentResourceNotFoundException exception = new DeploymentResourceNotFoundException();
        assertNull(exception.getMessage());
    }
}
