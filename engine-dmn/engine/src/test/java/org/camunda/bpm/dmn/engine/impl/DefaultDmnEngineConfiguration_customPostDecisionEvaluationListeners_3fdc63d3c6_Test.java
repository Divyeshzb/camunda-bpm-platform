// Test generated by RoostGPT for test Camunda-engine-dmn using AI Type Open AI and AI Model gpt-4

package org.camunda.bpm.dmn.engine.impl;

import org.camunda.bpm.dmn.engine.delegate.DmnDecisionEvaluationListener;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.List;

public class DefaultDmnEngineConfiguration_customPostDecisionEvaluationListeners_3fdc63d3c6_Test {

    private DefaultDmnEngineConfiguration defaultDmnEngineConfiguration;
    private List<DmnDecisionEvaluationListener> decisionEvaluationListeners;

    @BeforeEach
    public void setUp() {
        defaultDmnEngineConfiguration = new DefaultDmnEngineConfiguration();
        decisionEvaluationListeners = new ArrayList<>();
        decisionEvaluationListeners.add(Mockito.mock(DmnDecisionEvaluationListener.class));
    }

    @Test
    public void testCustomPostDecisionEvaluationListeners_Success() {
        DefaultDmnEngineConfiguration result = defaultDmnEngineConfiguration.customPostDecisionEvaluationListeners(decisionEvaluationListeners);
        assertNotNull(result);
        assertNotNull(result.getCustomPostDecisionEvaluationListeners());
    }

    @Test
    public void testCustomPostDecisionEvaluationListeners_Null() {
        DefaultDmnEngineConfiguration result = defaultDmnEngineConfiguration.customPostDecisionEvaluationListeners(null);
        assertNotNull(result);
        assertNull(result.getCustomPostDecisionEvaluationListeners());
    }
}
