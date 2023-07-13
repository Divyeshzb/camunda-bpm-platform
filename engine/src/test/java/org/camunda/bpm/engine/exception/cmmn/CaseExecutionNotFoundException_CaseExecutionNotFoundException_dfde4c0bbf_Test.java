package org.camunda.bpm.engine.exception.cmmn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CaseExecutionNotFoundException_CaseExecutionNotFoundException_dfde4c0bbf_Test {

    @Test
    public void testConstructorWithMessage() {
        String message = "Test message";
        CaseExecutionNotFoundException caseExecutionNotFoundException = new CaseExecutionNotFoundException(message);
        assertEquals(message, caseExecutionNotFoundException.getMessage());
    }

    @Test
    public void testConstructorWithNullMessage() {
        String message = null;
        CaseExecutionNotFoundException caseExecutionNotFoundException = new CaseExecutionNotFoundException(message);
        assertNull(caseExecutionNotFoundException.getMessage());
    }
}
