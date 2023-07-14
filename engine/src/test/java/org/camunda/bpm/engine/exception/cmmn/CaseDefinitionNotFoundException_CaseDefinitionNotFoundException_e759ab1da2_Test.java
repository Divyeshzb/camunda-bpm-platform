package org.camunda.bpm.engine.exception.cmmn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CaseDefinitionNotFoundException_CaseDefinitionNotFoundException_e759ab1da2_Test {

    private CaseDefinitionNotFoundException caseDefinitionNotFoundException;

    @BeforeEach
    public void setUp() {
        caseDefinitionNotFoundException = new CaseDefinitionNotFoundException();
    }

    @Test
    public void testDefaultConstructor() {
        assertNotNull(caseDefinitionNotFoundException);
    }
}
