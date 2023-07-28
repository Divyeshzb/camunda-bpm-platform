package org.camunda.bpm.dmn.engine.impl;

import org.camunda.bpm.dmn.engine.impl.spi.el.ElProvider;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class DefaultDmnEngineConfiguration_getElProvider_05893847c4_Test {

    @InjectMocks
    private DefaultDmnEngineConfiguration defaultDmnEngineConfiguration;

    @Mock
    private ElProvider elProvider;

    @Before
    public void setUp() {
        defaultDmnEngineConfiguration.setElProvider(elProvider);
    }

    @Test
    public void testGetElProvider_success() {
        ElProvider result = defaultDmnEngineConfiguration.getElProvider();
        assertNotNull(result);
        assertEquals(elProvider, result);
    }

    @Test
    public void testGetElProvider_null() {
        defaultDmnEngineConfiguration.setElProvider(null);
        ElProvider result = defaultDmnEngineConfiguration.getElProvider();
        assertNull(result);
    }
}
