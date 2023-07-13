package org.camunda.bpm.engine.exception;

import org.camunda.bpm.engine.BadUserRequestException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NotAllowedException_NotAllowedException_75a410f8f5_Test {

    private String testMessage;
    private Throwable testCause;
    private NotAllowedException exception;

    @BeforeEach
    public void setup() {
        testMessage = "This is a test message";
        testCause = new BadUserRequestException("Bad user request exception");
        exception = new NotAllowedException();
        exception.setMessage(testMessage);
        exception.setCause(testCause);
    }

    @Test
    public void testNotAllowedException_SuccessCase() {
        assertEquals(testMessage, exception.getMessage());
        assertEquals(testCause, exception.getCause());
    }

    @Test
    public void testNotAllowedException_FailureCase() {
        assertNotEquals("Different message", exception.getMessage());
        assertNotEquals(new Exception(), exception.getCause());
    }
}
