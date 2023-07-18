// Test generated by RoostGPT for test Camunda-engine-dmn using AI Type Open AI and AI Model gpt-4

package org.camunda.bpm.dmn.engine.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.camunda.bpm.dmn.engine.delegate.DmnDecisionEvaluationListener;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

public class DefaultDmnEngineConfiguration_getCustomPostDecisionEvaluationListeners_f40a834196_Test {

    private DefaultDmnEngineConfiguration defaultDmnEngineConfiguration;
    private List<DmnDecisionEvaluationListener> mockListeners;

    @BeforeEach
    public void setUp() {
        defaultDmnEngineConfiguration = Mockito.mock(DefaultDmnEngineConfiguration.class);
        mockListeners = new ArrayList<>();
        mockListeners.add(Mockito.mock(DmnDecisionEvaluationListener.class));
        mockListeners.add(Mockito.mock(DmnDecisionEvaluationListener.class));
        when(defaultDmnEngineConfiguration.getCustomPostDecisionEvaluationListeners()).thenReturn(mockListeners);
    }

    @Test
    public void testGetCustomPostDecisionEvaluationListeners() {
        List<DmnDecisionEvaluationListener> result = defaultDmnEngineConfiguration.getCustomPostDecisionEvaluationListeners();
        assertNotNull(result);
        assertEquals(2, result.size());
    }

    @Test
    public void testGetCustomPostDecisionEvaluationListenersWhenNoListeners() {
        when(defaultDmnEngineConfiguration.getCustomPostDecisionEvaluationListeners()).thenReturn(new ArrayList<>());
        List<DmnDecisionEvaluationListener> result = defaultDmnEngineConfiguration.getCustomPostDecisionEvaluationListeners();
        assertNotNull(result);
        assertEquals(0, result.size());
    }
}
