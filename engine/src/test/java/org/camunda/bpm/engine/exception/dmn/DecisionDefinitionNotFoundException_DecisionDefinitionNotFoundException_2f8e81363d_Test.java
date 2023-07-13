package org.camunda.bpm.engine.exception.dmn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DecisionDefinitionNotFoundException_DecisionDefinitionNotFoundException_2f8e81363d_Test {

    @Test
    public void testConstructorWithMessageAndCause() {
        String message = "Test message";
        Throwable cause = new Throwable("Test cause");
        DecisionDefinitionNotFoundException exception = new DecisionDefinitionNotFoundException();
        
        assertNull(exception.getMessage());
        assertNull(exception.getCause());
    }

    @Test
    public void testConstructorWithNullMessageAndCause() {
        DecisionDefinitionNotFoundException exception = new DecisionDefinitionNotFoundException();
        
        assertNull(exception.getMessage());
        assertNull(exception.getCause());
    }
}
