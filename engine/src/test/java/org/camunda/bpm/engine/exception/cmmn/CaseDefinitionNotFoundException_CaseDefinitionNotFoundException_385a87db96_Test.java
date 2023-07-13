package org.camunda.bpm.engine.exception.cmmn;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CaseDefinitionNotFoundException_CaseDefinitionNotFoundException_385a87db96_Test {

    private CaseDefinitionNotFoundException caseDefinitionNotFoundException;

    @BeforeEach
    public void setup() {
        caseDefinitionNotFoundException = new CaseDefinitionNotFoundException();
        caseDefinitionNotFoundException.setErrorMessage("Test message");
        caseDefinitionNotFoundException.setCause(new Throwable("Test cause"));
    }

    @Test
    public void testConstructorMessage() {
        assertEquals("Test message", caseDefinitionNotFoundException.getErrorMessage());
    }

    @Test
    public void testConstructorCause() {
        assertEquals("Test cause", caseDefinitionNotFoundException.getCause().getMessage());
    }
}
