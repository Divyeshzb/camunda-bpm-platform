// Test generated by RoostGPT for test Camunda-engine-dmn using AI Type Open AI and AI Model gpt-4

package org.camunda.bpm.dmn.engine.impl;

import org.camunda.bpm.dmn.engine.DmnDecision;
import org.camunda.bpm.dmn.engine.DmnDecisionLogic;
import org.camunda.bpm.dmn.engine.impl.evaluation.DmnDecisionLogicEvaluationHandler;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DefaultDmnDecisionContext_getDecisionEvaluationHandler_8dde4cf6f5_Test {

    @Mock
    private DmnDecision mockDecision;

    @Mock
    private DmnDecisionLogic mockDecisionLogic;

    @Mock
    private DmnDecisionLogicEvaluationHandler mockEvaluationHandler;

    private DefaultDmnDecisionContext decisionContext;

    @Before
    public void setUp() {
        decisionContext = new DefaultDmnDecisionContext();
        decisionContext.evaluationHandlers.put(mockDecisionLogic.getClass(), mockEvaluationHandler);
    }

    @Test
    public void getDecisionEvaluationHandler_WithExistingHandler_ReturnsHandler() {
        when(mockDecision.getDecisionLogic()).thenReturn(mockDecisionLogic);

        DmnDecisionLogicEvaluationHandler result = decisionContext.getDecisionEvaluationHandler(mockDecision);

        assertEquals(mockEvaluationHandler, result);
    }

    @Test(expected = DecisionLogicTypeNotSupported.class)
    public void getDecisionEvaluationHandler_WithNonExistingHandler_ThrowsException() {
        DmnDecisionLogic nonExistingLogic = Mockito.mock(DmnDecisionLogic.class);
        when(mockDecision.getDecisionLogic()).thenReturn(nonExistingLogic);

        decisionContext.getDecisionEvaluationHandler(mockDecision);
    }
}
