package org.camunda.bpm.engine.rest.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExceptionLogger_getStackTrace_a9ec437fca_Test {

    private ExceptionLogger exceptionLogger;

    @BeforeEach
    public void setUp() {
        exceptionLogger = new ExceptionLogger();
    }

    @Test
    public void testGetStackTrace_NullThrowable() {
        Throwable throwable = null;
        String stackTrace = exceptionLogger.getStackTrace(throwable);
        assertEquals("", stackTrace, "Expected an empty string for null throwable");
    }

    @Test
    public void testGetStackTrace_WithThrowable() {
        Throwable throwable = new Throwable("Test throwable");
        String stackTrace = exceptionLogger.getStackTrace(throwable);
        assertEquals("java.lang.Throwable: Test throwable", stackTrace.substring(0, stackTrace.indexOf("\n")), "Expected the first line of the stack trace to match the throwable's string representation");
    }
}
