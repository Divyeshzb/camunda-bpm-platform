package org.camunda.bpm.engine.exception.dmn;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DecisionDefinitionNotFoundException_DecisionDefinitionNotFoundException_e2d3be4d82_Test {

    private DecisionDefinitionNotFoundException exception;

    @Test
    public void testDecisionDefinitionNotFoundException_withValidMessage() {
        String expectedMessage = "Decision definition not found";
        exception = new DecisionDefinitionNotFoundException();
        exception.setMessage(expectedMessage);
        assertEquals(expectedMessage, exception.getMessage());
    }

    @Test
    public void testDecisionDefinitionNotFoundException_withEmptyMessage() {
        String expectedMessage = "";
        exception = new DecisionDefinitionNotFoundException();
        exception.setMessage(expectedMessage);
        assertEquals(expectedMessage, exception.getMessage());
    }
}
