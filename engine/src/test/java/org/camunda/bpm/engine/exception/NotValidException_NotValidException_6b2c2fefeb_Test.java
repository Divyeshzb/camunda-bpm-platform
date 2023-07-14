package org.camunda.bpm.engine.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class NotValidException_NotValidException_6b2c2fefeb_Test {

    private NotValidException notValidException;

    @BeforeEach
    public void setUp() {
        notValidException = new NotValidException();
    }

    @Test
    public void testNotValidException_Success() {
        assertNotNull(notValidException);
    }
}
