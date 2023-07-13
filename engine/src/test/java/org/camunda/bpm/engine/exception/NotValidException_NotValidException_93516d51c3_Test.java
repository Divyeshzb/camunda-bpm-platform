package org.camunda.bpm.engine.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NotValidException_NotValidException_93516d51c3_Test {

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testNotValidException() {
        assertThrows(NotValidException.class, () -> {
            throw new NotValidException("Error");
        });
    }

    @Test
    public void testNotValidExceptionWithMessage() {
        String errorMessage = "This is an error message";
        NotValidException exception = assertThrows(NotValidException.class, () -> {
            throw new NotValidException(errorMessage);
        });

        assertEquals(errorMessage, exception.getMessage());
    }
}
