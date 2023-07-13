package org.camunda.bpm.engine.exception.cmmn;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CaseDefinitionNotFoundException_CaseDefinitionNotFoundException_e759ab1da2_Test {

    @Test
    public void testCaseDefinitionNotFoundException_WithMessage() {
        CaseDefinitionNotFoundException caseDefinitionNotFoundException = new CaseDefinitionNotFoundException();
        caseDefinitionNotFoundException.setMessage("Test Message");
        assertEquals("Test Message", caseDefinitionNotFoundException.getMessage());
    }

    @Test
    public void testCaseDefinitionNotFoundException_WithDifferentMessage() {
        CaseDefinitionNotFoundException caseDefinitionNotFoundException = new CaseDefinitionNotFoundException();
        caseDefinitionNotFoundException.setMessage("Different Message");
        assertEquals("Different Message", caseDefinitionNotFoundException.getMessage());
    }

    @Test
    public void testCaseDefinitionNotFoundException_WithNullMessage() {
        CaseDefinitionNotFoundException caseDefinitionNotFoundException = new CaseDefinitionNotFoundException();
        caseDefinitionNotFoundException.setMessage(null);
        assertNull(caseDefinitionNotFoundException.getMessage());
    }
}
