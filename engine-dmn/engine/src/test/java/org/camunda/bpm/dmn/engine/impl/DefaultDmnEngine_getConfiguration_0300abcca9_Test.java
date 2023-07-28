package org.camunda.bpm.dmn.engine.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import org.camunda.bpm.dmn.engine.DmnEngineConfiguration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DefaultDmnEngine_getConfiguration_0300abcca9_Test {
    private DefaultDmnEngine defaultDmnEngine;
    private DmnEngineConfiguration dmnEngineConfiguration;

    @BeforeEach
    public void setUp() {
        defaultDmnEngine = new DefaultDmnEngine();
        dmnEngineConfiguration = mock(DmnEngineConfiguration.class);
        defaultDmnEngine.setConfiguration(dmnEngineConfiguration);
    }

    @Test
    public void testGetConfiguration() {
        DmnEngineConfiguration result = defaultDmnEngine.getConfiguration();
        assertEquals(dmnEngineConfiguration, result);
    }

    @Test
    public void testGetConfigurationWhenNoConfigurationSet() {
        DefaultDmnEngine dmnEngine = new DefaultDmnEngine();
        assertNull(dmnEngine.getConfiguration());
    }
}
