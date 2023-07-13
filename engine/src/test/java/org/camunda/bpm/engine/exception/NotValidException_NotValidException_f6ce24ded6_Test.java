package org.camunda.bpm.engine.exception;

import org.camunda.bpm.engine.BadUserRequestException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NotValidException_NotValidException_f6ce24ded6_Test {

    private BadUserRequestException cause;

    @BeforeEach
    public void setUp() {
        cause = new BadUserRequestException("Bad Request");
    }

    @Test
    public void testNotValidException_withCause() {
        NotValidException exception = new NotValidException();
        exception.initCause(cause);
        assertEquals(cause, exception.getCause());
    }

    @Test
    public void testNotValidException_withNullCause() {
        NotValidException exception = new NotValidException();
        exception.initCause(null);
        assertNull(exception.getCause());
    }
}
