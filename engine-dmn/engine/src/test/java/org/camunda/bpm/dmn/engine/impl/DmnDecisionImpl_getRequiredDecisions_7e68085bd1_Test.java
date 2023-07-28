package org.camunda.bpm.dmn.engine.impl;

import java.util.ArrayList;
import java.util.Collection;
import org.camunda.bpm.dmn.engine.DmnDecision;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DmnDecisionImpl_getRequiredDecisions_7e68085bd1_Test {

    @Mock
    private DmnDecisionImpl dmnDecisionImpl;

    private Collection<DmnDecision> requiredDecisions;

    @Before
    public void setUp() {
        requiredDecisions = new ArrayList<>();
        when(dmnDecisionImpl.getRequiredDecisions()).thenReturn(requiredDecisions);
    }

    @Test
    public void testGetRequiredDecisions_success() {
        Collection<DmnDecision> result = dmnDecisionImpl.getRequiredDecisions();
        assertEquals(requiredDecisions, result);
    }

    @Test
    public void testGetRequiredDecisions_empty() {
        requiredDecisions.clear();
        when(dmnDecisionImpl.getRequiredDecisions()).thenReturn(requiredDecisions);
        
        Collection<DmnDecision> result = dmnDecisionImpl.getRequiredDecisions();
        assertEquals(requiredDecisions, result);
    }
}
