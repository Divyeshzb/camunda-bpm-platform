package org.camunda.bpm.engine.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NotValidException_NotValidException_cb6727100c_Test {

    private NotValidException notValidExceptionWithValidMessageAndCause;
    private NotValidException notValidExceptionWithNullMessageAndCause;

    @BeforeEach
    public void setUp() {
        notValidExceptionWithValidMessageAndCause = new NotValidException();
        notValidExceptionWithNullMessageAndCause = new NotValidException();
    }

    @Test
    public void testNotValidException_withValidMessageAndCause() {
        assertNull(notValidExceptionWithValidMessageAndCause.getMessage());
        assertNull(notValidExceptionWithValidMessageAndCause.getCause());
    }

    @Test
    public void testNotValidException_withNullMessageAndCause() {
        assertNull(notValidExceptionWithNullMessageAndCause.getMessage());
        assertNull(notValidExceptionWithNullMessageAndCause.getCause());
    }
}
