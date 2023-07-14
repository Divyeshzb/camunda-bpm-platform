package org.camunda.bpm.engine.exception;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

// Assuming NotFoundException is in the same package
import org.camunda.bpm.engine.exception.NotFoundException;

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
}
