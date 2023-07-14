package org.camunda.bpm.engine.exception;

import org.camunda.bpm.engine.BadUserRequestException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NotAllowedException_NotAllowedException_67d8bf222b_Test {

    private NotAllowedException notAllowedException;
    private BadUserRequestException cause;

    @BeforeEach
    public void setUp() {
        cause = new BadUserRequestException("Bad user request");
        notAllowedException = new NotAllowedException();
        notAllowedException.initCause(cause);
    }

    @Test
    public void testNotAllowedExceptionWithCause() {
        Throwable actualCause = notAllowedException.getCause();
        assertNotNull(actualCause, "Cause should not be null");
        assertTrue(actualCause instanceof BadUserRequestException, "Cause should be instance of BadUserRequestException");
        assertEquals("Bad user request", actualCause.getMessage(), "Cause message should be 'Bad user request'");
    }

    @Test
    public void testNotAllowedExceptionWithNullCause() {
        NotAllowedException exception = new NotAllowedException();
        exception.initCause(null);
        assertNull(exception.getCause(), "Cause should be null");
    }
}
