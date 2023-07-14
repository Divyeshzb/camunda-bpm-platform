package org.camunda.bpm.engine.exception.dmn;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class DecisionDefinitionNotFoundException_DecisionDefinitionNotFoundException_9b29184037_Test {

    @Mock
    private Throwable cause;

    private DecisionDefinitionNotFoundException decisionDefinitionNotFoundException;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        decisionDefinitionNotFoundException = new DecisionDefinitionNotFoundException();
    }

    @Test
    public void testDecisionDefinitionNotFoundExceptionWithCause() {
        assertEquals(null, decisionDefinitionNotFoundException.getCause());
    }

    @Test
    public void testDecisionDefinitionNotFoundExceptionMessage() {
        String expectedMessage = "org.camunda.bpm.engine.exception.dmn.DecisionDefinitionNotFoundException";
        String actualMessage = decisionDefinitionNotFoundException.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
}
