package org.camunda.bpm.engine.exception.cmmn;

import org.camunda.bpm.engine.ProcessEngineException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CaseException_CaseException_e2af29dbcb_Test {

    private ProcessEngineException caseException;

    @BeforeEach
    public void setUp() {
        caseException = new ProcessEngineException();
    }

    @Test
    public void testCaseException_CaseException_Success() {
        assertNotNull(caseException);
    }

    @Test
    public void testCaseException_CaseException_NullMessage() {
        assertNull(caseException.getMessage());
    }

    @Test
    public void testCaseException_CaseException_NullCause() {
        assertNull(caseException.getCause());
    }
}
