package org.camunda.bpm.dmn.engine.impl;

import org.camunda.bpm.dmn.engine.DmnDecisionLogic;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DmnDecisionImpl_getDecisionLogic_55dc7690b4_Test {

    @InjectMocks
    private DmnDecisionImpl dmnDecisionImpl;

    @Mock
    private DmnDecisionLogic decisionLogic;

    @Before
    public void setUp() {
        when(dmnDecisionImpl.getDecisionLogic()).thenReturn(decisionLogic);
    }

    @Test
    public void testGetDecisionLogic_successCase() {
        DmnDecisionLogic result = dmnDecisionImpl.getDecisionLogic();
        assertEquals(decisionLogic, result);
    }

    @Test
    public void testGetDecisionLogic_failureCase() {
        when(dmnDecisionImpl.getDecisionLogic()).thenReturn(null);
        DmnDecisionLogic result = dmnDecisionImpl.getDecisionLogic();
        assertEquals(null, result);
    }
}
