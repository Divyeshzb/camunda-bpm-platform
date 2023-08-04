package org.camunda.bpm.dmn.engine.impl;

import org.camunda.bpm.dmn.engine.impl.spi.el.ElProvider;
import org.camunda.bpm.dmn.engine.impl.el.JuelElProvider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class DefaultDmnEngineConfiguration_initElProvider_e7ed92c10f_Test {

    @InjectMocks
    private DefaultDmnEngineConfiguration defaultDmnEngineConfiguration;

    @Mock
    private JuelElProvider juelElProvider;

    @Test
    public void testInitElProvider_WhenElProviderIsNull() {
        defaultDmnEngineConfiguration.initElProvider();
        ElProvider elProvider = defaultDmnEngineConfiguration.getElProvider();
        assertNotNull(elProvider);
        assertTrue(elProvider instanceof JuelElProvider);
    }

    @Test
    public void testInitElProvider_WhenElProviderIsNotNull() {
        defaultDmnEngineConfiguration.setElProvider(juelElProvider);
        defaultDmnEngineConfiguration.initElProvider();
        ElProvider elProvider = defaultDmnEngineConfiguration.getElProvider();
        assertNotNull(elProvider);
        assertEquals(juelElProvider, elProvider);
    }
}
