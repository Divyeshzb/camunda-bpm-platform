package org.camunda.bpm.engine.exception;

import org.camunda.bpm.engine.ProcessEngineException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NullValueException_NullValueException_30a316936e_Test {

    private NullValueException nullValueException;

    @BeforeEach
    public void setUp() {
        // use the default constructor of NullValueException
        nullValueException = new NullValueException();
    }

    @Test
    public void testNullValueException() {
        Throwable throwable = assertThrows(NullValueException.class, () -> {
            throw nullValueException;
        });
        assertNull(throwable.getMessage());
    }

    @Test
    public void testNullValueExceptionWithMessage() {
        String expectedMessage = "This is a null value exception.";
        // use the default constructor of NullValueException
        nullValueException = new NullValueException(expectedMessage);

        Throwable throwable = assertThrows(NullValueException.class, () -> {
            throw nullValueException;
        });
        assertEquals(expectedMessage, throwable.getMessage());
    }
}
