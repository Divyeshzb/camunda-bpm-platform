package org.camunda.bpm.engine.exception;

import org.camunda.bpm.engine.ProcessEngineException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NullValueException_NullValueException_30a316936e_Test {

    private ProcessEngineException processEngineException;

    @BeforeEach
    public void setUp() {
        processEngineException = new ProcessEngineException();
    }

    @Test
    public void testNullValueException() {
        assertTrue(processEngineException instanceof ProcessEngineException);
    }

    @Test
    public void testNullValueExceptionMessage() {
        assertNull(processEngineException.getMessage());
    }
}
