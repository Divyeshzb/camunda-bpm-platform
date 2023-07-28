package org.camunda.bpm.dmn.engine.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DefaultDmnEngineConfiguration_setEnableFeelLegacyBehavior_d5973adc0b_Test {

    private DefaultDmnEngineConfiguration defaultDmnEngineConfiguration;

    @BeforeEach
    public void setUp() {
        defaultDmnEngineConfiguration = new DefaultDmnEngineConfiguration();
    }

    @Test
    public void testSetEnableFeelLegacyBehavior_True() {
        // Act
        defaultDmnEngineConfiguration.setEnableFeelLegacyBehavior(true);

        // Assert
        assertTrue(defaultDmnEngineConfiguration.isEnableFeelLegacyBehavior());
    }

    @Test
    public void testSetEnableFeelLegacyBehavior_False() {
        // Act
        defaultDmnEngineConfiguration.setEnableFeelLegacyBehavior(false);

        // Assert
        assertFalse(defaultDmnEngineConfiguration.isEnableFeelLegacyBehavior());
    }
}
