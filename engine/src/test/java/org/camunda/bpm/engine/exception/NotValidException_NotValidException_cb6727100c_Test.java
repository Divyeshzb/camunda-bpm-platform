package org.camunda.bpm.engine.exception;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class NotValidException_NotValidException_cb6727100c_Test {
    @Mock
    private Throwable cause;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testNotValidException() {
        NotValidException exception = new NotValidException("Test message", cause);
        assertTrue(exception instanceof NotValidException);
    }
}
