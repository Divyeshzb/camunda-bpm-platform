package org.camunda.bpm.dmn.engine.impl;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DefaultDmnEngineConfiguration_isEnableFeelLegacyBehavior_28ac6618f5_Test {

    private DefaultDmnEngineConfiguration defaultDmnEngineConfiguration;

    @Before
    public void setUp() {
        defaultDmnEngineConfiguration = new DefaultDmnEngineConfiguration();
    }

    @Test
    public void testIsEnableFeelLegacyBehavior_true() {
        defaultDmnEngineConfiguration.setEnableFeelLegacyBehavior(true);
        boolean result = defaultDmnEngineConfiguration.isEnableFeelLegacyBehavior();
        assertEquals(true, result);
    }

    @Test
    public void testIsEnableFeelLegacyBehavior_false() {
        defaultDmnEngineConfiguration.setEnableFeelLegacyBehavior(false);
        boolean result = defaultDmnEngineConfiguration.isEnableFeelLegacyBehavior();
        assertEquals(false, result);
    }
}
