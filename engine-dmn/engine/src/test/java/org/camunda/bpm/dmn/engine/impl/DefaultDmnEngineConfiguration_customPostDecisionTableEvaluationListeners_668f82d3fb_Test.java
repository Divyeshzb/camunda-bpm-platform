// Test generated by RoostGPT for test Camunda-engine-dmn using AI Type Open AI and AI Model gpt-4

package org.camunda.bpm.dmn.engine.impl;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.camunda.bpm.dmn.engine.delegate.DmnDecisionTableEvaluationListener;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import java.util.Arrays;
import java.util.List;

public class DefaultDmnEngineConfiguration_customPostDecisionTableEvaluationListeners_668f82d3fb_Test {

    private DefaultDmnEngineConfiguration defaultDmnEngineConfiguration;
    private DmnDecisionTableEvaluationListener mockListener;

    @Before
    public void setUp() {
        defaultDmnEngineConfiguration = new DefaultDmnEngineConfiguration();
        mockListener = Mockito.mock(DmnDecisionTableEvaluationListener.class);
    }

    @Test
    public void testCustomPostDecisionTableEvaluationListeners() {
        List<DmnDecisionTableEvaluationListener> decisionTableEvaluationListeners = Arrays.asList(mockListener);
        DefaultDmnEngineConfiguration result = defaultDmnEngineConfiguration.customPostDecisionTableEvaluationListeners(decisionTableEvaluationListeners);

        assertEquals(decisionTableEvaluationListeners, defaultDmnEngineConfiguration.getCustomPostDecisionTableEvaluationListeners());
        assertEquals(defaultDmnEngineConfiguration, result);
    }

    @Test
    public void testCustomPostDecisionTableEvaluationListenersWithNull() {
        DefaultDmnEngineConfiguration result = defaultDmnEngineConfiguration.customPostDecisionTableEvaluationListeners(null);

        assertNull(defaultDmnEngineConfiguration.getCustomPostDecisionTableEvaluationListeners());
        assertEquals(defaultDmnEngineConfiguration, result);
    }
}
