package org.camunda.bpm.dmn.engine.impl;

import org.camunda.bpm.dmn.engine.DmnDecision;
import org.camunda.bpm.dmn.engine.DmnDecisionLogic;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class DmnDecisionImpl_toString_2393b88875_Test {
    private DmnDecisionTableImpl dmnDecisionTable;

    @Mock
    private DmnDecision requiredDecision;

    @Mock
    private DmnDecisionLogic decisionLogic;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        dmnDecisionTable = new DmnDecisionTableImpl();
        dmnDecisionTable.setKey("testKey");
        dmnDecisionTable.setName("testName");
        dmnDecisionTable.setRequiredDecision(requiredDecision);
        dmnDecisionTable.setDecisionLogic(decisionLogic);
    }

    @Test
    public void testToString() {
        when(requiredDecision.toString()).thenReturn("requiredDecision");
        when(decisionLogic.toString()).thenReturn("decisionLogic");
        String expected = "DmnDecisionTableImpl{ key= testKey, name= testName, requiredDecision=requiredDecision, decisionLogic=decisionLogic}";
        assertEquals(expected, dmnDecisionTable.toString());
    }

    @Test
    public void testToStringWithNullValues() {
        dmnDecisionTable.setKey(null);
        dmnDecisionTable.setName(null);
        dmnDecisionTable.setRequiredDecision(null);
        dmnDecisionTable.setDecisionLogic(null);
        String expected = "DmnDecisionTableImpl{ key= null, name= null, requiredDecision=null, decisionLogic=null}";
        assertEquals(expected, dmnDecisionTable.toString());
    }
}
