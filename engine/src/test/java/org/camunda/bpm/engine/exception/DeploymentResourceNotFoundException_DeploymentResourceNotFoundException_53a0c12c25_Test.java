package org.camunda.bpm.engine.exception;

import org.camunda.bpm.engine.ProcessEngineException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DeploymentResourceNotFoundException_DeploymentResourceNotFoundException_53a0c12c25_Test {

    @Mock
    private Throwable cause;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testDeploymentResourceNotFoundException_withValidCause() {
        DeploymentResourceNotFoundException exception = new DeploymentResourceNotFoundException();
        exception.initCause(cause);
        assertEquals(cause, exception.getCause());
    }

    @Test
    public void testDeploymentResourceNotFoundException_withNullCause() {
        DeploymentResourceNotFoundException exception = new DeploymentResourceNotFoundException();
        exception.initCause(null);
        assertTrue(exception.getCause() == null);
    }
}
