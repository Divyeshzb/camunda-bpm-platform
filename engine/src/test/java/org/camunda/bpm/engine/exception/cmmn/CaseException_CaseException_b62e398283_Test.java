package org.camunda.bpm.engine.exception.cmmn;

import org.camunda.bpm.engine.ProcessEngineException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CaseException_CaseException_b62e398283_Test {

    private Throwable cause;

    @BeforeEach
    public void setUp() {
        cause = new Throwable("Test throwable");
    }

    @Test
    public void testCaseExceptionWithValidCause() {
        CaseException caseException = new CaseException();
        caseException.initCause(cause);
        assertEquals(cause, caseException.getCause());
    }

    @Test
    public void testCaseExceptionWithNullCause() {
        CaseException caseException = new CaseException();
        caseException.initCause(null);
        assertNull(caseException.getCause());
    }
}
