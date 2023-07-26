package org.camunda.bpm.dmn.engine.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.camunda.bpm.dmn.engine.delegate.DmnDecisionTableEvaluationListener;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class DefaultDmnEngineConfiguration_initDecisionTableEvaluationListener_33f1930d52_Test {

    private DefaultDmnEngineConfiguration defaultDmnEngineConfiguration;

    @Mock
    private List<DmnDecisionTableEvaluationListener> customPreDecisionTableEvaluationListeners;

    @Mock
    private List<DmnDecisionTableEvaluationListener> customPostDecisionTableEvaluationListeners;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        defaultDmnEngineConfiguration = new DefaultDmnEngineConfiguration();
        defaultDmnEngineConfiguration.customPreDecisionTableEvaluationListeners = customPreDecisionTableEvaluationListeners;
        defaultDmnEngineConfiguration.customPostDecisionTableEvaluationListeners = customPostDecisionTableEvaluationListeners;
    }

    @Test
    public void testInitDecisionTableEvaluationListener_WithBothCustomListeners() {
        when(customPreDecisionTableEvaluationListeners.isEmpty()).thenReturn(false);
        when(customPostDecisionTableEvaluationListeners.isEmpty()).thenReturn(false);

        defaultDmnEngineConfiguration.initDecisionTableEvaluationListener();

        verify(customPreDecisionTableEvaluationListeners, times(1)).addAll(any(ArrayList.class));
        verify(customPostDecisionTableEvaluationListeners, times(1)).addAll(any(ArrayList.class));
        assertEquals(2, defaultDmnEngineConfiguration.decisionTableEvaluationListeners.size());
    }

    @Test
    public void testInitDecisionTableEvaluationListener_WithOnlyPreCustomListeners() {
        when(customPreDecisionTableEvaluationListeners.isEmpty()).thenReturn(false);
        when(customPostDecisionTableEvaluationListeners.isEmpty()).thenReturn(true);

        defaultDmnEngineConfiguration.initDecisionTableEvaluationListener();

        verify(customPreDecisionTableEvaluationListeners, times(1)).addAll(any(ArrayList.class));
        verify(customPostDecisionTableEvaluationListeners, times(0)).addAll(any(ArrayList.class));
        assertEquals(1, defaultDmnEngineConfiguration.decisionTableEvaluationListeners.size());
    }

    @Test
    public void testInitDecisionTableEvaluationListener_WithNoCustomListeners() {
        when(customPreDecisionTableEvaluationListeners.isEmpty()).thenReturn(true);
        when(customPostDecisionTableEvaluationListeners.isEmpty()).thenReturn(true);

        defaultDmnEngineConfiguration.initDecisionTableEvaluationListener();

        verify(customPreDecisionTableEvaluationListeners, times(0)).addAll(any(ArrayList.class));
        verify(customPostDecisionTableEvaluationListeners, times(0)).addAll(any(ArrayList.class));
        assertEquals(0, defaultDmnEngineConfiguration.decisionTableEvaluationListeners.size());
    }
}
