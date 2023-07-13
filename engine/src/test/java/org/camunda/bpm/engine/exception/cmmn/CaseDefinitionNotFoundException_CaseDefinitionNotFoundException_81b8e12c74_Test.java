package org.camunda.bpm.engine.exception.cmmn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CaseDefinitionNotFoundException_CaseDefinitionNotFoundException_81b8e12c74_Test {
    private CaseDefinitionNotFoundException caseDefinitionNotFoundException;

    @BeforeEach
    public void setUp() {
        caseDefinitionNotFoundException = new CaseDefinitionNotFoundException();
    }

    @Test
    public void testCaseDefinitionNotFoundException_noMessage() {
        assertNull(caseDefinitionNotFoundException.getMessage());
    }

    @Test
    public void testCaseDefinitionNotFoundException_withMessage() {
        String message = "Test Message";
        caseDefinitionNotFoundException.setMessage(message);
        assertEquals(message, caseDefinitionNotFoundException.getMessage());
    }
}
