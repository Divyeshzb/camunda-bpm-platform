package org.camunda.bpm.engine.exception;

import org.camunda.bpm.engine.ProcessEngineException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class NullValueException_NullValueException_1e0f2ec2fd_Test {

    @Test
    public void testNullValueException_WithValidCause() {
        Throwable cause = new Throwable("Valid cause");
        ProcessEngineException exception = new ProcessEngineException(cause);
        Assertions.assertEquals("Valid cause", exception.getCause().getMessage());
    }

    @Test
    public void testNullValueException_WithNullCause() {
        Throwable cause = null;
        ProcessEngineException exception = new ProcessEngineException(cause);
        Assertions.assertNull(exception.getCause());
    }

    @Test
    public void testNullValueException_WithMockedCause() {
        Throwable cause = Mockito.mock(Throwable.class);
        Mockito.when(cause.getMessage()).thenReturn("Mocked cause");
        ProcessEngineException exception = new ProcessEngineException(cause);
        Assertions.assertEquals("Mocked cause", exception.getCause().getMessage());
    }
}
