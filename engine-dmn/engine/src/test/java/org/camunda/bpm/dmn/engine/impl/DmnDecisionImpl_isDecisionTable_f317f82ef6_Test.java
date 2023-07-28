package org.camunda.bpm.dmn.engine.impl;

import org.camunda.bpm.dmn.engine.DmnDecisionLogic;
import org.camunda.bpm.dmn.engine.impl.decisiontable.DmnDecisionTableImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class DmnDecisionImpl_isDecisionTable_f317f82ef6_Test {

    @Mock
    private DmnDecisionTableImpl decisionTable;

    @Mock
    private DmnDecisionLogic decisionLogic;

    private DmnDecisionImpl decision;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        decision = new DmnDecisionImpl();
    }

    @Test
    public void testIsDecisionTable_WhenDecisionLogicIsNull_ShouldReturnFalse() {
        decision.setDecisionLogic(null);
        assertFalse(decision.isDecisionTable());
    }

    @Test
    public void testIsDecisionTable_WhenDecisionLogicIsNotInstanceOfDmnDecisionTableImpl_ShouldReturnFalse() {
        when(decisionLogic.isDecisionTable()).thenReturn(false);
        decision.setDecisionLogic(decisionLogic);
        assertFalse(decision.isDecisionTable());
    }

    @Test
    public void testIsDecisionTable_WhenDecisionLogicIsInstanceOfDmnDecisionTableImpl_ShouldReturnTrue() {
        when(decisionLogic.isDecisionTable()).thenReturn(true);
        decision.setDecisionLogic(decisionLogic);
        assertTrue(decision.isDecisionTable());
    }
}
