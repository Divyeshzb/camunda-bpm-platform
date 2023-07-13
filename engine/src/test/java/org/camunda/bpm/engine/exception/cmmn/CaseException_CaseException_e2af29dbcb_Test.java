package org.camunda.bpm.engine.exception.cmmn;

import org.camunda.bpm.engine.ProcessEngineException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CaseException_CaseException_e2af29dbcb_Test {

    private String message;
    private Throwable cause;

    @BeforeEach
    public void setUp() {
        message = "This is a test message";
        cause = new NullPointerException("This is a test NullPointerException");
    }

    @Test
    public void testCaseException_Success() {
        ProcessEngineException caseException = new ProcessEngineException(message, cause);
        assertEquals(message, caseException.getMessage());
        assertEquals(cause, caseException.getCause());
    }

    @Test
    public void testCaseException_NullMessage() {
        String nullMessage = null;
        ProcessEngineException caseException = new ProcessEngineException(nullMessage, cause);
        assertNull(caseException.getMessage());
        assertEquals(cause, caseException.getCause());
    }

    @Test
    public void testCaseException_NullCause() {
        Throwable nullCause = null;
        ProcessEngineException caseException = new ProcessEngineException(message, nullCause);
        assertEquals(message, caseException.getMessage());
        assertNull(caseException.getCause());
    }

    @Test
    public void testCaseException_NullMessageAndCause() {
        String nullMessage = null;
        Throwable nullCause = null;
        ProcessEngineException caseException = new ProcessEngineException(nullMessage, nullCause);
        assertNull(caseException.getMessage());
        assertNull(caseException.getCause());
    }
}
