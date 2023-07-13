package org.camunda.bpm.engine.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NotFoundException_NotFoundException_b5f83317fb_Test {

    private NotFoundException notFoundException;

    @BeforeEach
    public void setUp() {
        notFoundException = new NotFoundException();
    }

    @Test
    public void testNotNull() {
        assertNotNull(notFoundException);
    }

    @Test
    public void testInstanceOf() {
        assertTrue(notFoundException instanceof NotFoundException);
    }
}
