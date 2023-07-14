package org.camunda.bpm.engine.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.camunda.bpm.engine.ProcessEngineException;
import org.junit.jupiter.api.Test;

public class NullValueException_NullValueException_7be614d83f_Test {

    @Test
    public void testNullValueException_withValidMessage() {
        String message = "Test message";
        NullValueException exception = new NullValueException();
        exception.setMessage(message);
        assertEquals(message, exception.getMessage());
    }

    @Test
    public void testNullValueException_withNullMessage() {
        String message = null;
        NullValueException exception = new NullValueException();
        exception.setMessage(message);
        assertEquals(message, exception.getMessage());
    }

    @Test
    public void testNullValueException_withEmptyMessage() {
        String message = "";
        NullValueException exception = new NullValueException();
        exception.setMessage(message);
        assertEquals(message, exception.getMessage());
    }

    @Test
    public void testNullValueException_withWhitespaceMessage() {
        String message = " ";
        NullValueException exception = new NullValueException();
        exception.setMessage(message);
        assertEquals(message, exception.getMessage());
    }

    @Test
    public void testNullValueException_throwsProcessEngineException() {
        String message = "Test message";
        assertThrows(ProcessEngineException.class, () -> {
            NullValueException exception = new NullValueException();
            exception.setMessage(message);
            throw exception;
        });
    }
}
