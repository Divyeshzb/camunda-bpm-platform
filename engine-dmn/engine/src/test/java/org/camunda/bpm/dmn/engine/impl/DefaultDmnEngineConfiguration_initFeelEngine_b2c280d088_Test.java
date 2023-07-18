// Test generated by RoostGPT for test Camunda-engine-dmn using AI Type Open AI and AI Model gpt-4

package org.camunda.bpm.dmn.engine.impl;

import org.camunda.bpm.dmn.feel.impl.FeelEngine;
import org.camunda.bpm.dmn.feel.impl.FeelEngineFactory;
import org.camunda.bpm.dmn.feel.impl.juel.FeelEngineFactoryImpl;
import org.camunda.bpm.dmn.feel.impl.scala.ScalaFeelEngineFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

public class DefaultDmnEngineConfiguration_initFeelEngine_b2c280d088_Test {
    private DefaultDmnEngineConfiguration configuration;
    private FeelEngineFactory feelEngineFactory;
    private FeelEngine feelEngine;

    @BeforeEach
    public void setup() {
        configuration = new DefaultDmnEngineConfiguration();
        feelEngineFactory = Mockito.mock(FeelEngineFactory.class);
        feelEngine = Mockito.mock(FeelEngine.class);
    }

    @Test
    public void testInitFeelEngine_withLegacyBehaviorEnabled() {
        configuration.setEnableFeelLegacyBehavior(true);
        configuration.setFeelEngineFactory(null);
        configuration.initFeelEngine();
        assertNotNull(configuration.getFeelEngineFactory());
        assertNotNull(configuration.getFeelEngine());
    }

    @Test
    public void testInitFeelEngine_withoutLegacyBehaviorEnabled() {
        configuration.setEnableFeelLegacyBehavior(false);
        configuration.setFeelEngineFactory(null);
        configuration.initFeelEngine();
        assertNotNull(configuration.getFeelEngineFactory());
        assertNotNull(configuration.getFeelEngine());
    }

    @Test
    public void testInitFeelEngine_withFeelEngineFactoryAlreadySet() {
        when(feelEngineFactory.createInstance()).thenReturn(feelEngine);
        configuration.setFeelEngineFactory(feelEngineFactory);
        configuration.initFeelEngine();
        assertNotNull(configuration.getFeelEngine());
    }
}
