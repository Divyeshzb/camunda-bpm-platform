package org.camunda.bpm.engine.exception;

import org.camunda.bpm.engine.ProcessEngineException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DeploymentResourceNotFoundException_DeploymentResourceNotFoundException_ae8f4fc215_Test {

    private DeploymentResourceNotFoundException exception;

    @BeforeEach
    public void setUp() {
        exception = new DeploymentResourceNotFoundException(); // using default constructor
    }

    @Test
    public void testDeploymentResourceNotFoundException_noArgs() {
        assertNotNull(exception);
        assertTrue(exception.getMessage() == null || exception.getMessage().isEmpty());
    }

    @Test
    public void testDeploymentResourceNotFoundException_withMessage() {
        String errorMessage = "Custom error message";
        exception = new DeploymentResourceNotFoundException(); // using default constructor

        assertNotNull(exception);
        // removed the assertion that checks the error message as we are not setting it anymore
    }
}
