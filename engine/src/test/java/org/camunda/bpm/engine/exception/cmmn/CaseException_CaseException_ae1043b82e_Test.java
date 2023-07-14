package org.camunda.bpm.engine.exception.cmmn;

import org.camunda.bpm.engine.ProcessEngineException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CaseException_CaseException_ae1043b82e_Test {
    private CaseException caseException;

    @Test
    public void testCaseExceptionWithMessage() {
        String message = "Test exception message";
        caseException = new CaseException();
        assertTrue(caseException instanceof ProcessEngineException);
        caseException.setMessage(message);
        assertEquals(message, caseException.getMessage());
    }

    @Test
    public void testCaseExceptionWithEmptyMessage() {
        String message = "";
        caseException = new CaseException();
        assertTrue(caseException instanceof ProcessEngineException);
        caseException.setMessage(message);
        assertEquals(message, caseException.getMessage());
    }
}
