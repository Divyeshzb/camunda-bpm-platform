package org.camunda.bpm.dmn.engine.impl;

import org.camunda.bpm.dmn.feel.impl.FeelEngineFactory;
import org.camunda.bpm.dmn.feel.impl.juel.FeelEngineFactoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class DefaultDmnEngineConfiguration_getFeelEngineFactory_b0d7708340_Test {

    @Mock
    private FeelEngineFactoryImpl feelEngineFactoryImpl;

    private DefaultDmnEngineConfiguration defaultDmnEngineConfiguration;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        defaultDmnEngineConfiguration = new DefaultDmnEngineConfiguration();
        defaultDmnEngineConfiguration.setFeelEngineFactory(feelEngineFactoryImpl);
    }

    @Test
    public void testGetFeelEngineFactory_Success() {
        FeelEngineFactory result = defaultDmnEngineConfiguration.getFeelEngineFactory();
        assertEquals(feelEngineFactoryImpl, result);
    }

    @Test
    public void testGetFeelEngineFactory_Null() {
        defaultDmnEngineConfiguration.setFeelEngineFactory(null);
        FeelEngineFactory result = defaultDmnEngineConfiguration.getFeelEngineFactory();
        assertNull(result);
    }
}
