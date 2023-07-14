package org.camunda.bpm.engine.exception.cmmn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CaseExecutionNotFoundException_CaseExecutionNotFoundException_dc058c9c54_Test {

    private CaseExecutionNotFoundException caseExecutionNotFoundException;

    @BeforeEach
    public void setup() {
        caseExecutionNotFoundException = new CaseExecutionNotFoundException();
    }

    @Test
    public void testCaseExecutionNotFoundException_DefaultConstructor() {
        assertNotNull(caseExecutionNotFoundException);
    }
}
