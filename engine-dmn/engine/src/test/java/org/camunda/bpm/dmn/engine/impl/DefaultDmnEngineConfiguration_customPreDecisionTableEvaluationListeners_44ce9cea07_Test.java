package org.camunda.bpm.dmn.engine.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.camunda.bpm.dmn.engine.delegate.DmnDecisionTableEvaluationListener;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DefaultDmnEngineConfiguration_customPreDecisionTableEvaluationListeners_44ce9cea07_Test {

    private DefaultDmnEngineConfiguration defaultDmnEngineConfiguration;

    @BeforeEach
    public void setUp() {
        defaultDmnEngineConfiguration = new DefaultDmnEngineConfiguration();
    }

    @Test
    public void testCustomPreDecisionTableEvaluationListeners() {
        List<DmnDecisionTableEvaluationListener> mockListeners = new ArrayList<>();
        DmnDecisionTableEvaluationListener mockListener = Mockito.mock(DmnDecisionTableEvaluationListener.class);
        mockListeners.add(mockListener);
        
        defaultDmnEngineConfiguration.customPreDecisionTableEvaluationListeners(mockListeners);
        assertEquals(mockListeners, defaultDmnEngineConfiguration.getCustomPreDecisionTableEvaluationListeners());
    }

    @Test
    public void testCustomPreDecisionTableEvaluationListeners_NullList() {
        assertThrows(NullPointerException.class, () -> defaultDmnEngineConfiguration.customPreDecisionTableEvaluationListeners(null));
    }
}
