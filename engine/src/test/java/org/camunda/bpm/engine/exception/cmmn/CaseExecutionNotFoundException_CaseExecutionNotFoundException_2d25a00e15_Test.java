package org.camunda.bpm.engine.exception.cmmn;

import org.junit.Test;
import static org.junit.Assert.*;

public class CaseExecutionNotFoundExceptionTest {

    @Test
    public void testDefaultConstructor() {
        CaseExecutionNotFoundException exception = new CaseExecutionNotFoundException();
        assertNull(exception.getMessage());
    }

    @Test
    public void testParameterizedConstructor() {
        Throwable cause = new Throwable("This is a throwable cause");
        CaseExecutionNotFoundException exception = new CaseExecutionNotFoundException(cause);
        assertEquals("This is a throwable cause", exception.getCause().getMessage());
    }
}
