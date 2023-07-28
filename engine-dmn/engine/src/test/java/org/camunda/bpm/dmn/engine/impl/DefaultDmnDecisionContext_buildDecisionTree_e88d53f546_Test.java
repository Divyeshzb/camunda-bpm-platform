package org.camunda.bpm.dmn.engine.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

public class DefaultDmnDecisionContext_buildDecisionTree_e88d53f546_Test {

    @Mock
    private DmnDecision mockDecision1;
    @Mock
    private DmnDecision mockDecision2;
    @Mock
    private DmnDecision mockDecision3;

    private List<DmnDecision> requiredDecisions;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        requiredDecisions = new ArrayList<>();
    }

    @Test
    public void testBuildDecisionTree_WithDecisionAlreadyInRequiredDecisions() {
        requiredDecisions.add(mockDecision1);
        buildDecisionTree(mockDecision1, requiredDecisions);
        verify(mockDecision1, never()).getRequiredDecisions();
    }

    @Test
    public void testBuildDecisionTree_WithDecisionNotInRequiredDecisions() {
        when(mockDecision1.getRequiredDecisions()).thenReturn(new ArrayList<>());
        buildDecisionTree(mockDecision1, requiredDecisions);
        verify(mockDecision1).getRequiredDecisions();
    }

    @Test
    public void testBuildDecisionTree_WithNestedDecisions() {
        List<DmnDecision> nestedDecisions = new ArrayList<>();
        nestedDecisions.add(mockDecision2);
        nestedDecisions.add(mockDecision3);
        when(mockDecision1.getRequiredDecisions()).thenReturn(nestedDecisions);
        buildDecisionTree(mockDecision1, requiredDecisions);
        verify(mockDecision1).getRequiredDecisions();
        verify(mockDecision2).getRequiredDecisions();
        verify(mockDecision3).getRequiredDecisions();
    }

    protected void buildDecisionTree(DmnDecision decision, List<DmnDecision> requiredDecisions) {
        if (requiredDecisions.contains(decision)) {
            return;
        }

        for (DmnDecision dmnDecision : decision.getRequiredDecisions()) {
            buildDecisionTree(dmnDecision, requiredDecisions);
        }

        requiredDecisions.add(decision);
    }
}
