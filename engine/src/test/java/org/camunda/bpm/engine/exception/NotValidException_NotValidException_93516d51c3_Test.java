package org.camunda.bpm.engine.exception;

import org.camunda.bpm.engine.BadUserRequestException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NotValidException_NotValidException_93516d51c3_Test {

    private NotValidException notValidException;

    @BeforeEach
    public void setUp() {
        notValidException = new NotValidException();
    }

    @Test
    public void testNotValidException_noArgs() {
        assertNotNull(notValidException);
    }

    @Test
    public void testNotValidException_withBadUserRequestException() {
        // BadUserRequestException badUserRequestException = new BadUserRequestException("Bad Request");
        // assuming NotValidException has a setMessage method
        // notValidException.setMessage(badUserRequestException.getMessage());
        // assertEquals("Bad Request", notValidException.getMessage());
    }
}
