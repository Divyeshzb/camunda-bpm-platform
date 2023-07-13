package org.camunda.bpm.engine.exception;

import org.camunda.bpm.engine.ProcessEngineException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NullValueException_NullValueException_1e0f2ec2fd_Test {

    @Test
    public void testNullValueExceptionWithCause() {
        Throwable cause = new RuntimeException("Test exception");
        ProcessEngineException exception = new ProcessEngineException();
        exception.initCause(cause);
        
        assertEquals("Test exception", exception.getCause().getMessage());
    }

    @Test
    public void testNullValueExceptionWithNullCause() {
        Throwable cause = null;
        ProcessEngineException exception = new ProcessEngineException();
        exception.initCause(cause);

        String expectedMessage = "Cause cannot be null";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
