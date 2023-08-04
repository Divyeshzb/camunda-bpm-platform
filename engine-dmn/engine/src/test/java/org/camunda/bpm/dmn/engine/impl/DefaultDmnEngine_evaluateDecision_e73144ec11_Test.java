package org.camunda.bpm.dmn.engine.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

import org.camunda.bpm.dmn.engine.DmnDecision;
import org.camunda.bpm.dmn.engine.DmnDecisionResult;
import org.camunda.bpm.engine.variable.context.VariableContext;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class DefaultDmnEngine_evaluateDecision_e73144ec11_Test {

    private DefaultDmnEngine defaultDmnEngine;

    @Mock
    private DmnDecision decision1;

    @Mock
    private DmnDecision decision2;

    @Mock
    private DmnDecisionResult decisionResult;

    @Mock
    private InputStream inputStream;

    @Mock
    private VariableContext variableContext;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        defaultDmnEngine = new DefaultDmnEngine();
        when(decision1.getKey()).thenReturn("decision1Key");
        when(decision2.getKey()).thenReturn("decision2Key");
    }

    @Test
    public void testEvaluateDecision_Success() {
        when(defaultDmnEngine.parseDecisions(inputStream)).thenReturn(Arrays.asList(decision1, decision2));
        when(defaultDmnEngine.evaluateDecision(decision1, variableContext)).thenReturn(decisionResult);
        DmnDecisionResult result = defaultDmnEngine.evaluateDecision("decision1Key", inputStream, variableContext);
        assertEquals(decisionResult, result);
    }

    @Test
    public void testEvaluateDecision_NoDecisionFound() {
        when(defaultDmnEngine.parseDecisions(inputStream)).thenReturn(Arrays.asList(decision1, decision2));
        Exception exception = assertThrows(RuntimeException.class, () -> {
            defaultDmnEngine.evaluateDecision("nonExistentDecisionKey", inputStream, variableContext);
        });
        assertEquals("Unable to find decision with key nonExistentDecisionKey", exception.getMessage());
    }
}
