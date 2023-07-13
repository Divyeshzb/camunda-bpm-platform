package org.camunda.bpm.engine.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.camunda.bpm.engine.ProcessEngineException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NullValueException_NullValueException_c8eef0a9cc_Test {

    private NullValueException nullValueException;

    @Test
    public void testNullValueException_withMessageAndCause() {
        String message = "Test message";
        Throwable cause = new ProcessEngineException("Test cause");

        nullValueException = new NullValueException(message, cause);

        assertEquals(message, nullValueException.getMessage());
        assertEquals(cause, nullValueException.getCause());
    }

    @Test
    public void testNullValueException_withNullMessageAndCause() {
        nullValueException = new NullValueException(null, null);

        assertNull(nullValueException.getMessage());
        assertNull(nullValueException.getCause());
    }

    @Test
    public void testNullValueException_withMessageAndNullCause() {
        String message = "Test message";

        nullValueException = new NullValueException(message, null);

        assertEquals(message, nullValueException.getMessage());
        assertNull(nullValueException.getCause());
    }

    @Test
    public void testNullValueException_withNullMessageAndCause() {
        Throwable cause = new ProcessEngineException("Test cause");

        nullValueException = new NullValueException(null, cause);

        assertNull(nullValueException.getMessage());
        assertEquals(cause, nullValueException.getCause());
    }
}
