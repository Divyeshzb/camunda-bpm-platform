package org.camunda.bpm.engine.exception.cmmn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CaseExecutionNotFoundException extends RuntimeException {
    public CaseExecutionNotFoundException() {
        super();
    }

    public CaseExecutionNotFoundException(String message) {
        super(message);
    }
}

class CaseExecutionNotFoundException_CaseExecutionNotFoundException_dc058c9c54_Test {

    @Test
    public void testCaseExecutionNotFoundException() {
        CaseExecutionNotFoundException caseExecutionNotFoundException = new CaseExecutionNotFoundException();
        assertNotNull(caseExecutionNotFoundException);
    }

    @Test
    public void testCaseExecutionNotFoundExceptionWithMessage() {
        CaseExecutionNotFoundException exception = new CaseExecutionNotFoundException("Test exception message");
        assertNotNull(exception);
        assertThrows(CaseExecutionNotFoundException.class, () -> { throw exception; });
    }
}
