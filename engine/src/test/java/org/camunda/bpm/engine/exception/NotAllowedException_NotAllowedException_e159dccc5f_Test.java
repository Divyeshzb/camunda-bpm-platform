package org.camunda.bpm.engine.exception;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NotAllowedException_NotAllowedException_e159dccc5f_Test {

    private NotAllowedException exception;
    private String message;

    @BeforeEach
    public void setup() {
        message = "Test exception message";
        exception = new NotAllowedException();
        exception.setMessage(message);
    }

    @Test
    public void testNotAllowedExceptionWithMessage() {
        Assertions.assertEquals(message, exception.getMessage());
    }

    @Test
    public void testNotAllowedExceptionWithEmptyMessage() {
        exception = new NotAllowedException();
        exception.setMessage("");
        Assertions.assertEquals("", exception.getMessage());
    }
}
