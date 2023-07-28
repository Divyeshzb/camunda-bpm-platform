// Test generated by RoostGPT for test Camunda-engine-dmn using AI Type Open AI and AI Model gpt-4

package org.camunda.bpm.dmn.engine;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DmnEngineException_DmnEngineException_a9d8ecca80_Test {

    @Test
    public void testDmnEngineException() {
        String message = "Test Message";
        Throwable cause = new RuntimeException("Test Cause");

        DmnEngineException exception = new DmnEngineException(message, cause);

        assertEquals(message, exception.getMessage());
        assertEquals(cause, exception.getCause());
    }

    @Test
    public void testDmnEngineExceptionWithNullMessage() {
        String message = null;
        Throwable cause = new RuntimeException("Test Cause");

        DmnEngineException exception = new DmnEngineException(message, cause);

        assertNull(exception.getMessage());
        assertEquals(cause, exception.getCause());
    }

    @Test
    public void testDmnEngineExceptionWithNullCause() {
        String message = "Test Message";
        Throwable cause = null;

        DmnEngineException exception = new DmnEngineException(message, cause);

        assertEquals(message, exception.getMessage());
        assertNull(exception.getCause());
    }
}
