package org.camunda.bpm.engine.exception.cmmn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaseExecutionNotFoundException_CaseExecutionNotFoundException_dfde4c0bbf_Test {

    private CaseExecutionNotFoundException exception;

    @BeforeEach
    public void setUp() {
        exception = new CaseExecutionNotFoundException();
        exception.setMessage("Test message");
    }

    @Test
    public void testConstructor_withMessage() {
        assertEquals("Test message", exception.getMessage());
    }

    @Test
    public void testConstructor_withEmptyMessage() {
        exception = new CaseExecutionNotFoundException();
        exception.setMessage("");
        assertEquals("", exception.getMessage());
    }
}
