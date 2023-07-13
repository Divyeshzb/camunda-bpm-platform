package org.camunda.bpm.engine.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NotFoundException_NotFoundException_b724a8cf43_Test {

    private NotFoundException notFoundException;
    private static final String TEST_MESSAGE = "Test exception message";

    @BeforeEach
    public void setUp() {
        notFoundException = new NotFoundException();
        notFoundException.initCause(new Throwable(TEST_MESSAGE));
    }

    @Test
    public void testNotFoundException() {
        assertEquals(TEST_MESSAGE, notFoundException.getCause().getMessage());
    }

    @Test
    public void testNotFoundExceptionWithNullCause() {
        NotFoundException exception = new NotFoundException();
        exception.initCause(null);
        assertEquals(null, exception.getCause());
    }
}
