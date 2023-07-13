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
        cause = new BadUserRequestException("Bad Request");
        notAllowedException = new NotAllowedException();
        notAllowedException.initCause(cause);
    }

    @Test
    public void testNotAllowedException() {
        Throwable actualCause = notAllowedException.getCause();
        assertTrue(actualCause instanceof BadUserRequestException);
        assertEquals("Bad Request", actualCause.getMessage());
    }

    @Test
    public void testNotAllowedExceptionWithNullCause() {
        NotAllowedException exception = new NotAllowedException();
        assertNull(exception.getCause());
    }
}
