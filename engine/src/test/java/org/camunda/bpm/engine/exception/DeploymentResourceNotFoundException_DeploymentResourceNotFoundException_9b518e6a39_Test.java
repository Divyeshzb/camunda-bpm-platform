package org.camunda.bpm.engine.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class DeploymentResourceNotFoundException_DeploymentResourceNotFoundException_9b518e6a39_Test {

    private String testMessage;
    private DeploymentResourceNotFoundException exception;

    @BeforeEach
    public void setup() {
        testMessage = "Test exception message";
        exception = new DeploymentResourceNotFoundException();
        exception.setMessage(testMessage);
    }

    @Test
    public void testDeploymentResourceNotFoundException_Message() {
        Assertions.assertEquals(testMessage, exception.getMessage());
    }

    @Test
    public void testDeploymentResourceNotFoundException_NullMessage() {
        String nullMessage = null;
        exception = new DeploymentResourceNotFoundException();
        exception.setMessage(nullMessage);
        Assertions.assertNull(exception.getMessage());
    }

    @Test
    public void testDeploymentResourceNotFoundException_EmptyMessage() {
        String emptyMessage = "";
        exception = new DeploymentResourceNotFoundException();
        exception.setMessage(emptyMessage);
        Assertions.assertEquals("", exception.getMessage());
    }
}
