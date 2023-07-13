package org.camunda.bpm.engine.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NotFoundException_NotFoundException_27c3609b5b_Test {

    private NotFoundException notFoundException;

    @BeforeEach
    public void setUp() {
        notFoundException = new NotFoundException();
    }

    @Test
    public void testNotFoundExceptionMessage() {
        assertEquals(null, notFoundException.getMessage());
    }

    @Test
    public void testNotFoundExceptionNullMessage() {
        NotFoundException exception = new NotFoundException();
        assertEquals(null, exception.getMessage());
    }
}
