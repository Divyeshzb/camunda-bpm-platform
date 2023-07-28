package org.camunda.bpm.dmn.engine.impl;

import org.camunda.bpm.dmn.engine.DmnDecisionTableEvaluationListener;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DefaultDmnEngineConfiguration_customPreDecisionTableEvaluationListeners_44ce9cea07_Test {

    private DefaultDmnEngineConfiguration defaultDmnEngineConfiguration;
    private DmnDecisionTableEvaluationListener mockListener;

    @BeforeEach
    public void setup() {
        defaultDmnEngineConfiguration = new DefaultDmnEngineConfiguration();
        mockListener = Mockito.mock(DmnDecisionTableEvaluationListener.class);
    }

    @Test
    public void testCustomPreDecisionTableEvaluationListeners_withValidInput() {
        List<DmnDecisionTableEvaluationListener> decisionTableEvaluationListeners = new ArrayList<>();
        decisionTableEvaluationListeners.add(mockListener);

        DefaultDmnEngineConfiguration result = defaultDmnEngineConfiguration.customPreDecisionTableEvaluationListeners(decisionTableEvaluationListeners);

        assertNotNull(result);
        assertEquals(decisionTableEvaluationListeners, defaultDmnEngineConfiguration.getCustomPreDecisionTableEvaluationListeners());
    }

    @Test
    public void testCustomPreDecisionTableEvaluationListeners_withNullInput() {
        DefaultDmnEngineConfiguration result = defaultDmnEngineConfiguration.customPreDecisionTableEvaluationListeners(null);

        assertNotNull(result);
        assertEquals(new ArrayList<>(), defaultDmnEngineConfiguration.getCustomPreDecisionTableEvaluationListeners());
    }
}
