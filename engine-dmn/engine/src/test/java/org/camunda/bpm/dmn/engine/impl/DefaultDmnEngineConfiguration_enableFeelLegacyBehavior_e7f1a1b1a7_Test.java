package org.camunda.bpm.dmn.engine.impl;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DefaultDmnEngineConfiguration_enableFeelLegacyBehavior_e7f1a1b1a7_Test {

    private DefaultDmnEngineConfiguration defaultDmnEngineConfiguration;

    @Before
    public void setUp() {
        defaultDmnEngineConfiguration = new DefaultDmnEngineConfiguration();
    }

    @Test
    public void testEnableFeelLegacyBehaviorTrue() {
        boolean enableFeelLegacyBehavior = true;
        DefaultDmnEngineConfiguration result = defaultDmnEngineConfiguration.enableFeelLegacyBehavior(enableFeelLegacyBehavior);
        assertTrue(defaultDmnEngineConfiguration.isEnableFeelLegacyBehavior());
        assertEquals(defaultDmnEngineConfiguration, result);
    }

    @Test
    public void testEnableFeelLegacyBehaviorFalse() {
        boolean enableFeelLegacyBehavior = false;
        DefaultDmnEngineConfiguration result = defaultDmnEngineConfiguration.enableFeelLegacyBehavior(enableFeelLegacyBehavior);
        assertFalse(defaultDmnEngineConfiguration.isEnableFeelLegacyBehavior());
        assertEquals(defaultDmnEngineConfiguration, result);
    }
}
