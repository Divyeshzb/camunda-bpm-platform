package org.camunda.bpm.engine.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NotFoundException_NotFoundException_4f80993f0e_Test {

    private NotFoundException notFoundException;

    @BeforeEach
    public void setUp() {
        notFoundException = new NotFoundException();
    }

    @Test
    public void testNotFoundExceptionWithMessage() {
        String message = "Test Message";
        notFoundException.setMessage(message);
        assertEquals(message, notFoundException.getMessage());
        assertEquals(null, notFoundException.getCause());
    }

    @Test
    public void testNotFoundExceptionWithCause() {
        String message = "Test Message";
        Throwable cause = new Throwable("Test Cause");
        notFoundException.setMessage(message);
        notFoundException.setCause(cause);
        assertEquals(message, notFoundException.getMessage());
        assertEquals(cause, notFoundException.getCause());
    }
}
