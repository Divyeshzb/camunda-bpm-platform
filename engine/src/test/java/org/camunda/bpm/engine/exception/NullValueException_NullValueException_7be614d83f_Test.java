package org.camunda.bpm.engine.exception;

import org.junit.Test;
import static org.junit.Assert.*;

public class NullValueExceptionTest {
    @Test
    public void testExceptionMessage() {
        String message = "This is a test message";
        NullValueException exception = new NullValueException();
        exception.setMessage(message);
        assertEquals(message, exception.getMessage());
    }
}
