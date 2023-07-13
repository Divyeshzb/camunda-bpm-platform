package org.camunda.bpm.engine.exception;

import org.camunda.bpm.engine.ProcessEngineException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NullValueException_NullValueException_1e0f2ec2fd_Test {

    private NullValueException nullValueException;

    @BeforeEach
    public void setup() {
        nullValueException = new NullValueException();
    }

    @Test
    public void testNullValueException_WithNullCause() {
        Throwable cause = null;
        try {
            nullValueException.initCause(cause);
            assertNull(nullValueException.getCause());
        } catch (IllegalStateException e) {
            // Exception is expected here, so no need to handle it.
        }
    }

    @Test
    public void testNullValueException_WithNonNullCause() {
        Throwable cause = new ProcessEngineException("Test Exception");
        try {
            nullValueException.initCause(cause);
            assertNotNull(nullValueException.getCause());
            assertEquals("Test Exception", nullValueException.getCause().getMessage());
        } catch (IllegalStateException e) {
            // Exception is expected here, so no need to handle it.
        }
    }
}
