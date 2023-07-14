package org.camunda.bpm.engine.exception;

import org.camunda.bpm.engine.BadUserRequestException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NotFoundException_NotFoundException_b724a8cf43_Test {

    private Throwable cause;

    @BeforeEach
    public void setUp() {
        this.cause = new BadUserRequestException("Bad Request");
    }

    @Test
    public void testNotFoundException_withValidCause() {
        NotFoundException exception = new NotFoundException();
        exception.initCause(this.cause);
        assertEquals(this.cause, exception.getCause());
    }

    @Test
    public void testNotFoundException_withNullCause() {
        Throwable nullCause = null;
        NotFoundException exception = new NotFoundException();
        exception.initCause(nullCause);
        assertNull(exception.getCause());
    }
}
