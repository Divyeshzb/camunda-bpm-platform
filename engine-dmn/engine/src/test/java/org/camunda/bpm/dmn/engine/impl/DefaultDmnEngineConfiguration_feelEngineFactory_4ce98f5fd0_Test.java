package org.camunda.bpm.dmn.engine.impl;

import org.camunda.bpm.dmn.feel.impl.FeelEngine;
import org.camunda.bpm.dmn.feel.impl.FeelEngineFactory;
import org.camunda.bpm.dmn.feel.impl.juel.FeelEngineFactoryImpl;
import org.camunda.bpm.dmn.feel.impl.scala.ScalaFeelEngineFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

public class DefaultDmnEngineConfiguration_feelEngineFactory_4ce98f5fd0_Test {

    private DefaultDmnEngineConfiguration defaultDmnEngineConfiguration;

    @BeforeEach
    public void setUp() {
        defaultDmnEngineConfiguration = new DefaultDmnEngineConfiguration();
    }

    @Test
    public void testFeelEngineFactory_WithValidInput() {
        FeelEngineFactory feelEngineFactory = new FeelEngineFactoryImpl();
        defaultDmnEngineConfiguration.setFeelEngineFactory(feelEngineFactory);
        assertNotNull(defaultDmnEngineConfiguration.getFeelEngineFactory());
        assertEquals(feelEngineFactory, defaultDmnEngineConfiguration.getFeelEngineFactory());
    }

    @Test
    public void testFeelEngineFactory_WithNullInput() {
        defaultDmnEngineConfiguration.setFeelEngineFactory(null);
        assertNull(defaultDmnEngineConfiguration.getFeelEngineFactory());
    }

    @Test
    public void testFeelEngineFactory_WithMockedInput() {
        FeelEngineFactory feelEngineFactory = Mockito.mock(ScalaFeelEngineFactory.class);
        defaultDmnEngineConfiguration.setFeelEngineFactory(feelEngineFactory);
        assertNotNull(defaultDmnEngineConfiguration.getFeelEngineFactory());
        assertEquals(feelEngineFactory, defaultDmnEngineConfiguration.getFeelEngineFactory());
    }
}
