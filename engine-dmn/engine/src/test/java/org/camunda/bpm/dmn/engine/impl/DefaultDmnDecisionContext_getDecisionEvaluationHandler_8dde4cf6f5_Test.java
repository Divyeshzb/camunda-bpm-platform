package org.camunda.bpm.dmn.engine.impl;

import org.camunda.bpm.dmn.engine.DmnDecision;
import org.camunda.bpm.dmn.engine.DmnDecisionLogic;
import org.camunda.bpm.dmn.engine.impl.evaluation.DmnDecisionLogicEvaluationHandler;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;

public class DefaultDmnDecisionContext_getDecisionEvaluationHandler_8dde4cf6f5_Test {

    @Mock
    private DmnDecision dmnDecision;
    @Mock
    private DmnDecisionLogic dmnDecisionLogic;
    @Mock
    private DmnDecisionLogicEvaluationHandler dmnDecisionLogicEvaluationHandler;

    private DefaultDmnDecisionContext defaultDmnDecisionContext;
    private Map<Class<? extends DmnDecisionLogic>, DmnDecisionLogicEvaluationHandler> evaluationHandlers;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        evaluationHandlers = new HashMap<>();
        defaultDmnDecisionContext = new DefaultDmnDecisionContext();
    }

    @Test
    public void testGetDecisionEvaluationHandler_Success() {
        Class<? extends DmnDecisionLogic> key = dmnDecisionLogic.getClass();
        evaluationHandlers.put(key, dmnDecisionLogicEvaluationHandler);

        when(dmnDecision.getDecisionLogic()).thenReturn(dmnDecisionLogic);

        DmnDecisionLogicEvaluationHandler result = defaultDmnDecisionContext.getDecisionEvaluationHandler(dmnDecision);

        assertEquals(dmnDecisionLogicEvaluationHandler, result);
    }

    @Test
    public void testGetDecisionEvaluationHandler_Failure() {
        when(dmnDecision.getDecisionLogic()).thenReturn(dmnDecisionLogic);

        try {
            defaultDmnDecisionContext.getDecisionEvaluationHandler(dmnDecision);
            fail("Exception not thrown");
        } catch (Exception e) {
            assertEquals(Exception.class, e.getClass());
        }
    }
}
