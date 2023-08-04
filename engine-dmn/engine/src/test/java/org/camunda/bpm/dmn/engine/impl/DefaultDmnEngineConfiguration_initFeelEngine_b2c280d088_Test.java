package org.camunda.bpm.dmn.engine.impl;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.camunda.bpm.dmn.feel.impl.FeelEngine;
import org.camunda.bpm.dmn.feel.impl.FeelEngineFactory;
import org.camunda.bpm.dmn.feel.impl.juel.FeelEngineFactoryImpl;
import org.camunda.bpm.dmn.feel.impl.scala.ScalaFeelEngineFactory;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;

public class DefaultDmnEngineConfiguration_initFeelEngine_b2c280d088_Test {

    @Mock
    private FeelEngineFactory feelEngineFactory;

    @Mock
    private FeelEngine feelEngine;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testInitFeelEngineWithLegacyBehaviorDisabled() {
        DefaultDmnEngineConfiguration config = new DefaultDmnEngineConfiguration();
        config.setFeelEngineFactory(null);
        config.setEnableFeelLegacyBehavior(false);
        config.setFeelCustomFunctionProviders(new ArrayList<>());

        config.initFeelEngine();

        assertNotNull(config.getFeelEngineFactory());
        assertNotNull(config.getFeelEngine());
    }

    @Test
    public void testInitFeelEngineWithLegacyBehaviorEnabled() {
        DefaultDmnEngineConfiguration config = new DefaultDmnEngineConfiguration();
        config.setFeelEngineFactory(null);
        config.setEnableFeelLegacyBehavior(true);

        config.initFeelEngine();

        assertNotNull(config.getFeelEngineFactory());
        assertNotNull(config.getFeelEngine());
    }

    @Test
    public void testInitFeelEngineWithExistingFactory() {
        when(feelEngineFactory.createInstance()).thenReturn(feelEngine);

        DefaultDmnEngineConfiguration config = new DefaultDmnEngineConfiguration();
        config.setFeelEngineFactory(feelEngineFactory);

        config.initFeelEngine();

        assertNotNull(config.getFeelEngine());
    }
}
