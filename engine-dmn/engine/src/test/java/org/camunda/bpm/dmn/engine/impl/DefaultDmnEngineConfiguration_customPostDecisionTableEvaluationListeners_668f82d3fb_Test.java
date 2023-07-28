package org.camunda.bpm.dmn.engine.impl;

import org.camunda.bpm.dmn.engine.delegate.DmnDecisionTableEvaluationListener;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class DefaultDmnEngineConfiguration_customPostDecisionTableEvaluationListeners_668f82d3fb_Test {

    private DefaultDmnEngineConfiguration defaultDmnEngineConfiguration;
    private DmnDecisionTableEvaluationListener listener1;
    private DmnDecisionTableEvaluationListener listener2;

    @BeforeEach
    public void setUp() {
        defaultDmnEngineConfiguration = new DefaultDmnEngineConfiguration();
        listener1 = Mockito.mock(DmnDecisionTableEvaluationListener.class);
        listener2 = Mockito.mock(DmnDecisionTableEvaluationListener.class);
    }

    @Test
    public void testCustomPostDecisionTableEvaluationListeners() {
        List<DmnDecisionTableEvaluationListener> decisionTableEvaluationListeners = Arrays.asList(listener1, listener2);
        defaultDmnEngineConfiguration.customPostDecisionTableEvaluationListeners(decisionTableEvaluationListeners);

        List<DmnDecisionTableEvaluationListener> actualListeners = defaultDmnEngineConfiguration.getCustomPostDecisionTableEvaluationListeners();

        assertEquals(decisionTableEvaluationListeners, actualListeners);
    }

    @Test
    public void testCustomPostDecisionTableEvaluationListeners_NullList() {
        defaultDmnEngineConfiguration.customPostDecisionTableEvaluationListeners(null);

        List<DmnDecisionTableEvaluationListener> actualListeners = defaultDmnEngineConfiguration.getCustomPostDecisionTableEvaluationListeners();

        assertEquals(null, actualListeners);
    }

    @Test
    public void testCustomPostDecisionTableEvaluationListeners_EmptyList() {
        defaultDmnEngineConfiguration.customPostDecisionTableEvaluationListeners(Arrays.asList());

        List<DmnDecisionTableEvaluationListener> actualListeners = defaultDmnEngineConfiguration.getCustomPostDecisionTableEvaluationListeners();

        assertEquals(0, actualListeners.size());
    }
}
