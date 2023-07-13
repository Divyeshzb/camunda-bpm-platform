package org.camunda.bpm.engine.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.camunda.bpm.engine.ProcessEngineException;

public class NullValueException_NullValueException_7be614d83f_Test {

    private NullValueException nullValueException;

    @BeforeEach
    public void setUp() {
        nullValueException = new NullValueException();
        nullValueException.setMessage("Test message");
    }

    @Test
    public void testNullValueException() {
        assertEquals("Test message", nullValueException.getMessage());
    }

    @Test
    public void testNullValueExceptionWithNullMessage() {
        NullValueException exception = new NullValueException();
        exception.setMessage(null);
        assertEquals(null, exception.getMessage());
    }
}
