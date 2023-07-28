package org.camunda.bpm.dmn.engine.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

import org.camunda.bpm.dmn.engine.DmnDecision;
import org.camunda.bpm.dmn.engine.DmnDecisionResult;
import org.camunda.bpm.engine.variable.context.VariableContext;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class DefaultDmnEngine_evaluateDecision_e73144ec11_Test {

    @InjectMocks
    private DefaultDmnEngine defaultDmnEngine;

    @Mock
    private DmnDecision dmnDecision;

    @Mock
    private VariableContext variableContext;

    @Mock
    private InputStream inputStream;

    @BeforeEach
    public void setup() {
        when(dmnDecision.getKey()).thenReturn("decisionKey");
    }

    @Test
    public void testEvaluateDecision_Success() {
        List<DmnDecision> decisions = Arrays.asList(dmnDecision);
        when(defaultDmnEngine.parseDecisions(inputStream)).thenReturn(decisions);

        DmnDecisionResult result = mock(DmnDecisionResult.class);
        when(defaultDmnEngine.evaluateDecision(dmnDecision, variableContext)).thenReturn(result);

        DmnDecisionResult actualResult = defaultDmnEngine.evaluateDecision("decisionKey", inputStream, variableContext);

        assertEquals(result, actualResult);
    }

    @Test
    public void testEvaluateDecision_Failure() {
        List<DmnDecision> decisions = Arrays.asList(dmnDecision);
        when(defaultDmnEngine.parseDecisions(inputStream)).thenReturn(decisions);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            defaultDmnEngine.evaluateDecision("wrongKey", inputStream, variableContext);
        });

        String expectedMessage = "Unable to find decision with key: wrongKey";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
