package org.camunda.bpm.engine.exception;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.camunda.bpm.engine.BadUserRequestException;

public class NotValidException_NotValidException_f6ce24ded6_Test {

    @Test
    public void testNotValidExceptionWithCause() {
        Throwable cause = new BadUserRequestException("Bad Request");
        NotValidException exception = new NotValidException();
        exception.initCause(cause);
        assertEquals("Bad Request", exception.getCause().getMessage());
    }

    @Test
    public void testNotValidExceptionWithNullCause() {
        Throwable cause = null;
        NotValidException exception = new NotValidException();
        exception.initCause(cause);
        assertNull(exception.getCause());
    }
}
