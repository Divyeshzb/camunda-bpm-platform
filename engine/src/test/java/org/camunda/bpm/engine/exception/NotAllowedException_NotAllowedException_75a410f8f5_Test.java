package org.camunda.bpm.engine.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NotAllowedException_NotAllowedException_75a410f8f5_Test {

    private String message;
    private Throwable cause;

    @BeforeEach
    public void setUp() {
        message = "This is a test message";
        cause = new RuntimeException("This is a test cause");
    }

    @Test
    public void testNotAllowedExceptionMessage() {
        NotAllowedException exception = new NotAllowedException();
        exception.setMessage(message);
        assertEquals(message, exception.getMessage());
    }

    @Test
    public void testNotAllowedExceptionCause() {
        NotAllowedException exception = new NotAllowedException();
        exception.setCause(cause);
        assertEquals(cause, exception.getCause());
    }

    @Test
    public void testNotAllowedExceptionMessageAndCause() {
        NotAllowedException exception = new NotAllowedException();
        exception.setMessage(message);
        exception.setCause(cause);
        assertTrue(exception.getMessage().contains(message));
        assertEquals(cause, exception.getCause());
    }
}
