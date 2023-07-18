// Test generated by RoostGPT for test Camunda-engine-dmn using AI Type Open AI and AI Model gpt-4

package org.camunda.bpm.dmn.engine.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class DefaultDmnEngineConfiguration_init_0ef02243a9_Test {

    @InjectMocks
    private DefaultDmnEngineConfiguration defaultDmnEngineConfiguration;

    @Mock
    private DmnEngineMetricCollector dmnEngineMetricCollector;

    @Mock
    private DmnDecisionTableEvaluationListener dmnDecisionTableEvaluationListener;

    @Mock
    private DmnDecisionEvaluationListener dmnDecisionEvaluationListener;

    @Mock
    private DmnScriptEngineResolver dmnScriptEngineResolver;

    @Mock
    private ElProvider elProvider;

    @Mock
    private FeelEngine feelEngine;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testInit() {
        defaultDmnEngineConfiguration.init();

        verify(defaultDmnEngineConfiguration, times(1)).initMetricCollector();
        verify(defaultDmnEngineConfiguration, times(1)).initDecisionTableEvaluationListener();
        verify(defaultDmnEngineConfiguration, times(1)).initDecisionEvaluationListener();
        verify(defaultDmnEngineConfiguration, times(1)).initScriptEngineResolver();
        verify(defaultDmnEngineConfiguration, times(1)).initElDefaults();
        verify(defaultDmnEngineConfiguration, times(1)).initElProvider();
        verify(defaultDmnEngineConfiguration, times(1)).initFeelEngine();
    }
}
