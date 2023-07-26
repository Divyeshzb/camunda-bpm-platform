package org.camunda.bpm.dmn.engine.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.*;

public class DefaultDmnDecisionContext_buildDecisionTree_e88d53f546_Test {

    @Mock
    DmnDecision decision1, decision2, decision3;

    List<DmnDecision> requiredDecisions;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        requiredDecisions = new ArrayList<>();
        when(decision1.getRequiredDecisions()).thenReturn(new ArrayList<>());
        when(decision2.getRequiredDecisions()).thenReturn(new ArrayList<>());
        when(decision3.getRequiredDecisions()).thenReturn(new ArrayList<>());
    }

    @Test
    public void testBuildDecisionTree_WhenDecisionIsAlreadyInRequiredDecisions() {
        requiredDecisions.add(decision1);
        buildDecisionTree(decision1, requiredDecisions);
        verify(decision1, times(0)).getRequiredDecisions();
    }

    @Test
    public void testBuildDecisionTree_WhenDecisionIsNotInRequiredDecisions() {
        buildDecisionTree(decision1, requiredDecisions);
        verify(decision1, times(1)).getRequiredDecisions();
        assert(requiredDecisions.contains(decision1));
    }

    protected void buildDecisionTree(DmnDecision decision, List<DmnDecision> requiredDecisions) {
        if (requiredDecisions.contains(decision)) {
            return;
        }

        for(DmnDecision dmnDecision : decision.getRequiredDecisions()){
            buildDecisionTree(dmnDecision, requiredDecisions);
        }

        requiredDecisions.add(decision);
    }
}
