package org.camunda.bpm.dmn.engine.impl;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

public class DefaultDmnDecisionContext_generateDecisionEvaluationEvent_c5c9d9aee7_Test {
    @Mock
    DmnDecisionLogicEvaluationEvent evaluatedEvent1, evaluatedEvent2;

    @Mock
    DmnDecisionEvaluationListener evaluationListener;

    List<DmnDecisionLogicEvaluationEvent> evaluatedEvents;
    List<DmnDecisionEvaluationListener> evaluationListeners;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        evaluatedEvents = new ArrayList<>();
        evaluatedEvents.add(evaluatedEvent1);
        evaluatedEvents.add(evaluatedEvent2);

        evaluationListeners = new ArrayList<>();
        evaluationListeners.add(evaluationListener);
    }

    @Test
    public void testGenerateDecisionEvaluationEvent() {
        when(evaluatedEvent1.getExecutedDecisionElements()).thenReturn(2L);
        when(evaluatedEvent2.getExecutedDecisionElements()).thenReturn(3L);

        DefaultDmnDecisionContext context = new DefaultDmnDecisionContext();
        context.generateDecisionEvaluationEvent(evaluatedEvents);

        verify(evaluationListener, times(1)).notify(any(DmnDecisionEvaluationEventImpl.class));
        verify(evaluatedEvent1, times(1)).getExecutedDecisionElements();
        verify(evaluatedEvent2, times(1)).getExecutedDecisionElements();
    }

    @Test(expected = NullPointerException.class)
    public void testGenerateDecisionEvaluationEventWithNullEvaluatedEvents() {
        DefaultDmnDecisionContext context = new DefaultDmnDecisionContext();
        context.generateDecisionEvaluationEvent(null);
    }
}
