// Test generated by RoostGPT for test Camunda-engine-dmn using AI Type Open AI and AI Model gpt-4

package org.camunda.bpm.dmn.engine;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.camunda.bpm.dmn.engine.impl.DefaultDmnEngineConfiguration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class DmnEngineConfiguration_createDefaultDmnEngineConfiguration_0ea045a85a_Test {

    @Mock
    DmnEngineConfiguration dmnEngineConfiguration;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCreateDefaultDmnEngineConfigurationIsNotNull() {
        dmnEngineConfiguration = DmnEngineConfiguration.createDefaultDmnEngineConfiguration();
        assertNotNull(dmnEngineConfiguration, "The created DmnEngineConfiguration should not be null");
    }

    @Test
    public void testCreateDefaultDmnEngineConfigurationIsOfCorrectType() {
        dmnEngineConfiguration = DmnEngineConfiguration.createDefaultDmnEngineConfiguration();
        assertTrue(dmnEngineConfiguration instanceof DefaultDmnEngineConfiguration, "The created DmnEngineConfiguration should be instance of DefaultDmnEngineConfiguration");
    }
}
