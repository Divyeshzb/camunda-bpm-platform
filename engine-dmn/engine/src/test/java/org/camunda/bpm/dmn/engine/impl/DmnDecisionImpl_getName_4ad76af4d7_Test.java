package org.camunda.bpm.dmn.engine.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.camunda.bpm.dmn.engine.DmnDecision;

public class DmnDecisionImpl_getName_4ad76af4d7_Test {

    @Mock
    private DmnDecision dmnDecision;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testNameNotNull() {
        String name = "TestName";
        Mockito.when(dmnDecision.getName()).thenReturn(name);
        Assertions.assertEquals(name, dmnDecision.getName(), "The name should be TestName");
    }

    @Test
    public void testNameNull() {
        Mockito.when(dmnDecision.getName()).thenReturn(null);
        Assertions.assertNull(dmnDecision.getName(), "The name should be null");
    }
}
