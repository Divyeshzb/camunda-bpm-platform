package org.camunda.bpm.engine.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.camunda.bpm.engine.BadUserRequestException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NotAllowedException extends RuntimeException {
    public NotAllowedException(String message) {
        super(message);
    }
}

public class NotAllowedException_NotAllowedException_e159dccc5f_Test {

    private NotAllowedException notAllowedException;

    @BeforeEach
    public void setUp() {
        notAllowedException = new NotAllowedException("This is a test message");
    }

    @Test
    public void testNotAllowedException_success() {
        String message = "This is a test message";
        assertEquals(message, notAllowedException.getMessage());
    }

    @Test
    public void testNotAllowedException_failure() {
        String wrongMessage = "This is a wrong test message";
        assertThrows(BadUserRequestException.class, () -> {
            if (!notAllowedException.getMessage().equals(wrongMessage)) {
                throw new BadUserRequestException("Wrong message");
            }
        });
    }
}
