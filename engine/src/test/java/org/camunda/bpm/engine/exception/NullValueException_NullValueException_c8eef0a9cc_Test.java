package org.camunda.bpm.engine.exception;

import org.camunda.bpm.engine.ProcessEngineException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NullValueException_NullValueException_c8eef0a9cc_Test {

    @Test
    public void testNullValueExceptionWithMessage() {
        String message = "Test message";
        NullValueException exception = new NullValueException();
        exception.setMessage(message);
        Assertions.assertEquals(message, exception.getMessage());
        Assertions.assertNull(exception.getCause());
    }

    @Test
    public void testNullValueExceptionWithCause() {
        String message = "Test message";
        Throwable cause = new ProcessEngineException("Test cause");
        NullValueException exception = new NullValueException();
        exception.setMessage(message);
        exception.setCause(cause);
        Assertions.assertEquals(message, exception.getMessage());
        Assertions.assertEquals(cause, exception.getCause());
    }
}
