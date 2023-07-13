package org.camunda.bpm.engine.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NotFoundException_NotFoundException_b724a8cf43_Test {

    private NotFoundException notFoundException;

    @BeforeEach
    public void setUp() {
        notFoundException = new NotFoundException();
    }

    @Test
    public void testNotFoundException_ShouldReturnNotNull() {
        assertNotNull(notFoundException, "Exception object should not be null");
    }

    @Test
    public void testNotFoundException_MessageShouldBeNull() {
        assertNull(notFoundException.getMessage(), "Exception message should be null");
    }
}
