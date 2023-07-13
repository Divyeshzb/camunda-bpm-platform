package org.camunda.bpm.engine.exception.dmn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DecisionDefinitionNotFoundExceptionTest {

    @Test
    public void testDefaultConstructor() {
        DecisionDefinitionNotFoundException exception = new DecisionDefinitionNotFoundException();
        assertNull(exception.getMessage());
    }

    @Test
    public void testParameterizedConstructor() {
        String message = "Test message";
        DecisionDefinitionNotFoundException exception = new DecisionDefinitionNotFoundException(message);
        assertEquals(message, exception.getMessage());
    }
}
