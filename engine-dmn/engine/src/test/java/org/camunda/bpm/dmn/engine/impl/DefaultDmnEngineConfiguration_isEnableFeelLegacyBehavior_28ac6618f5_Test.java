package org.camunda.bpm.dmn.engine.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class DefaultDmnEngineConfiguration_isEnableFeelLegacyBehavior_28ac6618f5_Test {

    @InjectMocks
    private DefaultDmnEngineConfiguration defaultDmnEngineConfiguration;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testIsEnableFeelLegacyBehaviorTrue() {
        defaultDmnEngineConfiguration.setEnableFeelLegacyBehavior(true);
        boolean result = defaultDmnEngineConfiguration.isEnableFeelLegacyBehavior();
        Assert.assertTrue(result);
    }

    @Test
    public void testIsEnableFeelLegacyBehaviorFalse() {
        defaultDmnEngineConfiguration.setEnableFeelLegacyBehavior(false);
        boolean result = defaultDmnEngineConfiguration.isEnableFeelLegacyBehavior();
        Assert.assertFalse(result);
    }
}
