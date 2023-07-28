package org.camunda.bpm.dmn.engine.impl;

import org.camunda.bpm.dmn.feel.impl.FeelEngine;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class DefaultDmnEngineConfiguration_getFeelEngine_f6b657c84a_Test {

    @Mock
    private DefaultDmnEngineConfiguration defaultDmnEngineConfiguration;

    private FeelEngine feelEngine;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        feelEngine = new FeelEngine();
        when(defaultDmnEngineConfiguration.getFeelEngine()).thenReturn(feelEngine);
    }

    @Test
    public void testGetFeelEngine_success() {
        FeelEngine result = defaultDmnEngineConfiguration.getFeelEngine();
        assertEquals(feelEngine, result, "getFeelEngine should return the correct FeelEngine");
    }

    @Test
    public void testGetFeelEngine_failure() {
        when(defaultDmnEngineConfiguration.getFeelEngine()).thenReturn(null);

        FeelEngine result = defaultDmnEngineConfiguration.getFeelEngine();
        assertEquals(null, result, "getFeelEngine should return null when FeelEngine is not set");
    }
}
