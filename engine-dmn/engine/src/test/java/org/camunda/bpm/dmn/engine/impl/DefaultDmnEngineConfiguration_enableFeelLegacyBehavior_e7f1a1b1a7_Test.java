package org.camunda.bpm.dmn.engine.impl;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
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
        defaultDmnEngineConfiguration.enableFeelLegacyBehavior(enableFeelLegacyBehavior);
        assertTrue(defaultDmnEngineConfiguration.isEnableFeelLegacyBehavior());
    }

    @Test
    public void testEnableFeelLegacyBehaviorFalse() {
        boolean enableFeelLegacyBehavior = false;
        defaultDmnEngineConfiguration.enableFeelLegacyBehavior(enableFeelLegacyBehavior);
        assertFalse(defaultDmnEngineConfiguration.isEnableFeelLegacyBehavior());
    }
}
