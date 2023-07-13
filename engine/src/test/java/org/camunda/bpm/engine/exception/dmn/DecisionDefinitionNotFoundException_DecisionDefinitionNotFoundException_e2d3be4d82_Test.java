package org.camunda.bpm.engine.exception.dmn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DecisionDefinitionNotFoundException_DecisionDefinitionNotFoundException_e2d3be4d82_Test {

    private DecisionDefinitionNotFoundException decisionDefinitionNotFoundException;

    @BeforeEach
    public void setUp() {
        decisionDefinitionNotFoundException = new DecisionDefinitionNotFoundException();
    }

    @Test
    public void testDecisionDefinitionNotFoundException() {
        assertThrows(DecisionDefinitionNotFoundException.class, () -> {
            throw decisionDefinitionNotFoundException;
        });
    }
}
