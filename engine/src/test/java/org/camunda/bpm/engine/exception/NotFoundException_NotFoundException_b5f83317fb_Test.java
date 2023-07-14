package org.camunda.bpm.engine.exception;

import org.camunda.bpm.engine.BadUserRequestException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NotFoundException_NotFoundException_b5f83317fb_Test {

    private NotFoundException notFoundException;

    @BeforeEach
    public void setup() {
        notFoundException = new NotFoundException();
    }

    @Test
    public void testNotFoundException() {
        assertThrows(NotFoundException.class, () -> {
            throw notFoundException;
        }, "Expected NotFoundException to be thrown, but it didn't");
    }

    @Test
    public void testNotFoundExceptionWithMessage() {
        NotFoundException exceptionWithMessage = new NotFoundException("Test message");
        assertThrows(NotFoundException.class, () -> {
            throw exceptionWithMessage;
        }, "Expected NotFoundException to be thrown, but it didn't");
    }

    @Test
    public void testNotFoundExceptionWithCause() {
        NotFoundException exceptionWithCause = new NotFoundException(new Throwable("Test cause"));
        assertThrows(NotFoundException.class, () -> {
            throw exceptionWithCause;
        }, "Expected NotFoundException to be thrown, but it didn't");
    }

    @Test
    public void testNotFoundExceptionWithMessageAndCause() {
        NotFoundException exceptionWithMessageAndCause = new NotFoundException("Test message", new Throwable("Test cause"));
        assertThrows(NotFoundException.class, () -> {
            throw exceptionWithMessageAndCause;
        }, "Expected NotFoundException to be thrown, but it didn't");
    }
}
