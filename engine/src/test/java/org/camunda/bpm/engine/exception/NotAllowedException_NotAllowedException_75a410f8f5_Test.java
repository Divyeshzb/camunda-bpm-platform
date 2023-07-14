package org.camunda.bpm.engine.exception;

import org.camunda.bpm.engine.BadUserRequestException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NotAllowedException_NotAllowedException_75a410f8f5_Test {

    private Throwable cause;

    @BeforeEach
    public void setup() {
        cause = new BadUserRequestException("Bad request");
    }

    @Test
    public void testNotAllowedExceptionSuccess() {
        NotAllowedException exception = new NotAllowedException();
        assertNull(exception.getMessage());
        assertNull(exception.getCause());
    }
    
    @Test
    public void testNotAllowedExceptionWithNullMessage() {
        NotAllowedException exception = new NotAllowedException();
        assertNull(exception.getMessage());
        assertNull(exception.getCause());
    }

    @Test
    public void testNotAllowedExceptionWithNullCause() {
        NotAllowedException exception = new NotAllowedException();
        assertNull(exception.getMessage());
        assertNull(exception.getCause());
    }

    @Test
    public void testNotAllowedExceptionWithNullMessageAndCause() {
        NotAllowedException exception = new NotAllowedException();
        assertNull(exception.getMessage());
        assertNull(exception.getCause());
    }

}
