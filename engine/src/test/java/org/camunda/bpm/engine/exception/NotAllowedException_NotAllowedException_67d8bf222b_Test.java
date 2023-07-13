package org.camunda.bpm.engine.exception;

import org.camunda.bpm.engine.BadUserRequestException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NotAllowedException_NotAllowedException_67d8bf222b_Test {

    private NotAllowedException notAllowedException;
    private BadUserRequestException cause;

    @BeforeEach
    public void setup() {
        cause = new BadUserRequestException("Bad User Request");
        notAllowedException = new NotAllowedException("Not Allowed");
    }

    @Test
    public void testNotAllowedExceptionWithCause() {
        notAllowedException.initCause(cause);
        Throwable actualCause = notAllowedException.getCause();
        assertTrue(actualCause instanceof BadUserRequestException);
        assertEquals("Bad User Request", actualCause.getMessage());
    }

    @Test
    public void testNotAllowedExceptionWithNullCause() {
        notAllowedException.initCause(null);
        Throwable actualCause = notAllowedException.getCause();
        assertNull(actualCause);
    }
}
