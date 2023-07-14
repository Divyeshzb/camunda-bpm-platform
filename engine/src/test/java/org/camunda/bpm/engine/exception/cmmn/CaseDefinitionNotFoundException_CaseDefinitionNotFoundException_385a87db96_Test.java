package org.camunda.bpm.engine.exception.cmmn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CaseDefinitionNotFoundException_CaseDefinitionNotFoundException_385a87db96_Test {

    private String message;
    private Throwable cause;

    @BeforeEach
    public void setUp() {
        message = "Test message";
        cause = new NullPointerException();
    }

    @Test
    public void testConstructorWithMessageAndCause() {
        CaseDefinitionNotFoundException exception = new CaseDefinitionNotFoundException(message, cause);
        assertEquals(message, exception.getMessage());
        assertEquals(cause, exception.getCause());
    }

    @Test
    public void testConstructorWithNullMessageAndCause() {
        CaseDefinitionNotFoundException exception = new CaseDefinitionNotFoundException(null, null);
        assertNull(exception.getMessage());
        assertNull(exception.getCause());
    }
}
