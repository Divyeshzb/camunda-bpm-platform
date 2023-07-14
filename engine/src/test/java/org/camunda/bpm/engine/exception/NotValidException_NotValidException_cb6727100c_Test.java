package org.camunda.bpm.engine.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NotValidException_NotValidException_cb6727100c_Test {

    private NotValidException notValidExceptionWithMessageAndCause;
    private NotValidException notValidExceptionWithNullMessageAndCause;

    @BeforeEach
    public void setUp() {
        notValidExceptionWithMessageAndCause = new NotValidException();
        notValidExceptionWithMessageAndCause.initCause(new Throwable("Test throwable"));
        notValidExceptionWithMessageAndCause.setMessage("Test message");

        notValidExceptionWithNullMessageAndCause = new NotValidException();
        notValidExceptionWithNullMessageAndCause.initCause(null);
        notValidExceptionWithNullMessageAndCause.setMessage(null);
    }

    @Test
    public void testNotValidException_withMessageAndCause() {
        String message = "Test message";
        Throwable cause = new Throwable("Test throwable");
        assertAll("NotValidException",
                () -> assertEquals(message, notValidExceptionWithMessageAndCause.getMessage()),
                () -> assertEquals(cause.toString(), notValidExceptionWithMessageAndCause.getCause().toString()));
    }

    @Test
    public void testNotValidException_withNullMessageAndCause() {
        assertAll("NotValidException",
                () -> assertNull(notValidExceptionWithNullMessageAndCause.getMessage()),
                () -> assertNull(notValidExceptionWithNullMessageAndCause.getCause()));
    }
}
