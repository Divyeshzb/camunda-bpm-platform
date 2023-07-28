package org.camunda.bpm.dmn.engine.impl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.camunda.bpm.dmn.engine.DmnDecisionLogicEvaluationEvent;
import org.camunda.bpm.dmn.engine.delegate.DmnDecisionEvaluationListener;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class DefaultDmnDecisionContext_generateDecisionEvaluationEvent_c5c9d9aee7_Test {

    @InjectMocks
    private DefaultDmnDecisionContext defaultDmnDecisionContext;

    @Mock
    private DmnDecisionLogicEvaluationEvent dmnDecisionLogicEvaluationEvent;

    @Mock
    private DmnDecisionEvaluationListener dmnDecisionEvaluationListener;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGenerateDecisionEvaluationEvent_Success() {
        List<DmnDecisionLogicEvaluationEvent> evaluatedEvents = new ArrayList<>();
        evaluatedEvents.add(dmnDecisionLogicEvaluationEvent);

        when(dmnDecisionLogicEvaluationEvent.getExecutedDecisionElements()).thenReturn(5L);

        defaultDmnDecisionContext.generateDecisionEvaluationEvent(evaluatedEvents);

        verify(dmnDecisionEvaluationListener, times(1)).notify(any());
        assertEquals(1, defaultDmnDecisionContext.getDecisionEvaluationEvent().getExecutedDecisionInstances());
        assertEquals(5L, defaultDmnDecisionContext.getDecisionEvaluationEvent().getExecutedDecisionElements());
    }

    @Test(expected = NullPointerException.class)
    public void testGenerateDecisionEvaluationEvent_NullList() {
        defaultDmnDecisionContext.generateDecisionEvaluationEvent(null);
    }
}
