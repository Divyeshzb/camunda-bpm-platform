package org.camunda.bpm.engine.exception.cmmn;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class CaseExecutionNotFoundException_CaseExecutionNotFoundException_c3f209f0e4_Test {

    @Mock
    Throwable cause;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testCaseExecutionNotFoundException_Success() {
        String message = "Test Message";
        CaseExecutionNotFoundException exception = new CaseExecutionNotFoundException();
        assertEquals(message, exception.getMessage());
        assertEquals(cause, exception.getCause());
    }

    @Test
    public void testCaseExecutionNotFoundException_NullMessage() {
        String message = null;
        CaseExecutionNotFoundException exception = new CaseExecutionNotFoundException();
        assertEquals(message, exception.getMessage());
        assertEquals(cause, exception.getCause());
    }
}
