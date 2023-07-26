package org.camunda.bpm.dmn.engine.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.InputStream;
import java.util.Arrays;

import org.camunda.bpm.dmn.engine.DmnDecision;
import org.camunda.bpm.dmn.engine.DmnDecisionResult;
import org.camunda.bpm.engine.variable.context.VariableContext;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DefaultDmnEngine_evaluateDecision_e73144ec11_Test {

    private DefaultDmnEngine defaultDmnEngine;
    private DmnDecision mockDecision;
    private DmnDecisionResult mockResult;
    private VariableContext mockVariableContext;
    private InputStream mockInputStream;

    @BeforeEach
    public void setUp() {
        defaultDmnEngine = new DefaultDmnEngine();
        mockDecision = mock(DmnDecision.class);
        mockResult = mock(DmnDecisionResult.class);
        mockVariableContext = mock(VariableContext.class);
        mockInputStream = mock(InputStream.class);
    }

    @Test
    public void testEvaluateDecision_Success() {
        when(mockDecision.getKey()).thenReturn("decisionKey");
        when(defaultDmnEngine.parseDecisions(mockInputStream)).thenReturn(Arrays.asList(mockDecision));
        when(defaultDmnEngine.evaluateDecision(mockDecision, mockVariableContext)).thenReturn(mockResult);

        DmnDecisionResult result = defaultDmnEngine.evaluateDecision("decisionKey", mockInputStream, mockVariableContext);

        assertEquals(mockResult, result);
    }

    @Test
    public void testEvaluateDecision_DecisionNotFound() {
        when(mockDecision.getKey()).thenReturn("anotherDecisionKey");
        when(defaultDmnEngine.parseDecisions(mockInputStream)).thenReturn(Arrays.asList(mockDecision));

        Exception exception = assertThrows(RuntimeException.class, () -> {
            defaultDmnEngine.evaluateDecision("decisionKey", mockInputStream, mockVariableContext);
        });

        String expectedMessage = "Unable to find decision with key: decisionKey";
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }
}
