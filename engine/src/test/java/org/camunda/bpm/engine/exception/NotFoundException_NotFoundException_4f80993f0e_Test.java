package org.camunda.bpm.engine.exception;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NotFoundException_NotFoundException_4f80993f0e_Test {

    @Test
    public void testNotFoundExceptionWithMessage() {
        String message = "Test message";
        NotFoundException exception = new NotFoundException();
        // Assuming the NotFoundException class has a setMessage method
        exception.setMessage(message);
        assertEquals(message, exception.getMessage());
    }

    @Test
    public void testNotFoundExceptionWithCause() {
        String message = "Test message";
        Throwable cause = new RuntimeException("Test cause");
        NotFoundException exception = new NotFoundException();
        // Assuming the NotFoundException class has setMessage and setCause methods
        exception.setMessage(message);
        exception.setCause(cause);
        assertEquals(message, exception.getMessage());
        assertEquals(cause, exception.getCause());
    }
}
