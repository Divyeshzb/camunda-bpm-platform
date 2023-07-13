package org.camunda.bpm.engine.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NotValidException_NotValidException_6b2c2fefeb_Test {

    private NotValidException notValidException;

    @BeforeEach
    public void setup() {
        notValidException = new NotValidException();
    }

    @Test
    public void testNotValidException_withErrorMessage() {
        String errorMessage = "This is an error message";
        notValidException.setMessage(errorMessage);
        assertEquals(errorMessage, notValidException.getMessage());
    }

    @Test
    public void testNotValidException_withEmptyMessage() {
        String errorMessage = "";
        notValidException.setMessage(errorMessage);
        assertEquals(errorMessage, notValidException.getMessage());
    }

    @Test
    public void testNotValidException_withNullMessage() {
        String errorMessage = null;
        notValidException.setMessage(errorMessage);
        assertNull(notValidException.getMessage());
    }
}
