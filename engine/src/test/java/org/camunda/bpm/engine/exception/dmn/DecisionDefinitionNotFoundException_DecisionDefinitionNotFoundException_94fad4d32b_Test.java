package org.camunda.bpm.engine.exception.dmn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DecisionDefinitionNotFoundException_DecisionDefinitionNotFoundException_94fad4d32b_Test {

    private DecisionDefinitionNotFoundException exception;

    @BeforeEach
    public void setUp() {
        exception = new DecisionDefinitionNotFoundException();
    }

    @Test
    public void testDecisionDefinitionNotFoundException() {
        // Test if the exception is of type DecisionDefinitionNotFoundException
        assertTrue(exception instanceof DecisionDefinitionNotFoundException);
    }

    @Test
    public void testExceptionMessageIsNull() {
        // Test if the exception message is null as no message is passed during the instantiation
        assertNull(exception.getMessage());
    }

}
