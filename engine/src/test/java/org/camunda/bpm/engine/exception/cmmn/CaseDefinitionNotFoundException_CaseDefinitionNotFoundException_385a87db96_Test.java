package org.camunda.bpm.engine.exception.cmmn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CaseDefinitionNotFoundException_CaseDefinitionNotFoundException_385a87db96_Test {

    private CaseDefinitionNotFoundException caseDefinitionNotFoundException;
    private String message = "Test message";
    private Throwable cause = new Exception("Test exception");

    @BeforeEach
    void setUp() {
        caseDefinitionNotFoundException = new CaseDefinitionNotFoundException();
        caseDefinitionNotFoundException.setMessage(message);
        caseDefinitionNotFoundException.setCause(cause);
    }

    @Test
    void testMessage() {
        assertEquals(message, caseDefinitionNotFoundException.getMessage());
    }

    @Test
    void testCause() {
        assertEquals(cause, caseDefinitionNotFoundException.getCause());
    }
}
