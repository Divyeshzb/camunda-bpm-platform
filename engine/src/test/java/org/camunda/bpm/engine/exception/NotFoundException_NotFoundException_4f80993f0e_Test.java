package org.camunda.bpm.engine.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NotFoundException_NotFoundException_4f80993f0e_Test {
    private NotFoundException notFoundException;

    @BeforeEach
    public void setUp() {
        notFoundException = new NotFoundException();
    }

    @Test
    public void testNotFoundExceptionWithMessage() {
        String message = "Test message";
        notFoundException.setMessage(message);
        assertEquals(message, notFoundException.getMessage());
        assertNull(notFoundException.getCause());
    }

    @Test
    public void testNotFoundExceptionWithCause() {
        Throwable cause = new Throwable("Test cause");
        notFoundException.setCause(cause);
        assertEquals(cause, notFoundException.getCause());
        assertNull(notFoundException.getMessage());
    }

    @Test
    public void testNotFoundExceptionWithMessageAndCause() {
        String message = "Test message";
        Throwable cause = new Throwable("Test cause");
        notFoundException.setMessage(message);
        notFoundException.setCause(cause);
        assertEquals(message, notFoundException.getMessage());
        assertEquals(cause, notFoundException.getCause());
    }
}
