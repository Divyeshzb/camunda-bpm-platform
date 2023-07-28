package org.camunda.bpm.dmn.engine.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.mock;

import org.camunda.bpm.dmn.engine.DmnDecision;
import org.camunda.bpm.dmn.engine.DmnDecisionResult;
import org.camunda.bpm.engine.variable.context.VariableContext;
import org.junit.Before;
import org.junit.Test;

public class DefaultDmnEngine_evaluateDecision_69d4b7215f_Test {

    private DefaultDmnEngine defaultDmnEngine;
    private DmnDecision decision;
    private VariableContext variableContext;

    @Before
    public void setUp() {
        defaultDmnEngine = new DefaultDmnEngine();
        decision = mock(DmnDecision.class);
        variableContext = mock(VariableContext.class);
    }

    @Test
    public void testEvaluateDecision_Success() {
        DmnDecisionResult result = defaultDmnEngine.evaluateDecision(decision, variableContext);
        assertNotNull(result);
    }

    @Test
    public void testEvaluateDecision_Failure() {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            defaultDmnEngine.evaluateDecision(decision, variableContext);
        });
        assertEquals("Decision type not supported", exception.getMessage());
    }
}
