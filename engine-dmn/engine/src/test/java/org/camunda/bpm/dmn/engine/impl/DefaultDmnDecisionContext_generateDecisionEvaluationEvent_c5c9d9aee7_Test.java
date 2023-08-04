package org.camunda.bpm.dmn.engine.impl;

import org.camunda.bpm.dmn.engine.delegate.DmnDecisionEvaluationListener;
import org.camunda.bpm.dmn.engine.impl.delegate.DmnDecisionEvaluationEventImpl;
import org.camunda.bpm.dmn.engine.delegate.DmnDecisionLogicEvaluationEvent;
import org.camunda.bpm.engine.variable.Variables;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class DefaultDmnDecisionContext_generateDecisionEvaluationEvent_c5c9d9aee7_Test {

    private DefaultDmnDecisionContext defaultDmnDecisionContext;
    private List<DmnDecisionLogicEvaluationEvent> evaluatedEvents;
    private DmnDecisionLogicEvaluationEvent evaluatedEvent1;
    private DmnDecisionLogicEvaluationEvent evaluatedEvent2;
    private DmnDecisionEvaluationListener evaluationListener;

    @Before
    public void setUp() {
        defaultDmnDecisionContext = new DefaultDmnDecisionContext();
        evaluatedEvents = new ArrayList<>();
        evaluatedEvent1 = mock(DmnDecisionLogicEvaluationEvent.class);
        evaluatedEvent2 = mock(DmnDecisionLogicEvaluationEvent.class);
        evaluationListener = mock(DmnDecisionEvaluationListener.class);

        when(evaluatedEvent1.getExecutedDecisionElements()).thenReturn(2L);
        when(evaluatedEvent2.getExecutedDecisionElements()).thenReturn(3L);

        evaluatedEvents.add(evaluatedEvent1);
        evaluatedEvents.add(evaluatedEvent2);

        defaultDmnDecisionContext.getEvaluationListeners().add(evaluationListener);
    }

    @Test
    public void testGenerateDecisionEvaluationEvent() {
        defaultDmnDecisionContext.generateDecisionEvaluationEvent(evaluatedEvents);

        verify(evaluationListener, times(1)).notify(any(DmnDecisionEvaluationEventImpl.class));
        verify(evaluatedEvent1, times(1)).getExecutedDecisionElements();
        verify(evaluatedEvent2, times(1)).getExecutedDecisionElements();
    }

    @Test(expected = NullPointerException.class)
    public void testGenerateDecisionEvaluationEventWithNull() {
        defaultDmnDecisionContext.generateDecisionEvaluationEvent(null);
    }
}
