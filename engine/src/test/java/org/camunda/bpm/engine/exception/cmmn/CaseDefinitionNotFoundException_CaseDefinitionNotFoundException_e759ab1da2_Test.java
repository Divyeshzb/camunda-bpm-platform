package org.camunda.bpm.engine.exception.cmmn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CaseDefinitionNotFoundException_CaseDefinitionNotFoundException_e759ab1da2_Test {

    private CaseDefinitionNotFoundException caseDefinitionNotFoundException;
    private String message = "Case definition not found";

    @BeforeEach
    public void setUp() {
        caseDefinitionNotFoundException = new CaseDefinitionNotFoundException(message);
    }

    @Test
    public void testCaseDefinitionNotFoundException_Success() {
        assertEquals(message, caseDefinitionNotFoundException.getMessage());
    }

    @Test
    public void testCaseDefinitionNotFoundException_NullMessage() {
        CaseDefinitionNotFoundException nullMessageException = new CaseDefinitionNotFoundException(null);
        assertNull(nullMessageException.getMessage());
    }
}
