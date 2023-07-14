package org.camunda.bpm.engine.exception.cmmn;

import org.camunda.bpm.engine.ProcessEngineException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CaseException_CaseException_b62e398283_Test {

    @Test
    public void testCaseExceptionWithNullException() {
        CaseException caseException = new CaseException();
        assertNull(caseException.getCause());
    }

    @Test
    public void testCaseExceptionWithRealException() {
        CaseException caseException = new CaseException();
        Exception exception = new RuntimeException("This is a test exception");
        caseException.initCause(exception);
        assertNotNull(caseException.getCause());
        assertEquals("This is a test exception", caseException.getCause().getMessage());
    }
}
