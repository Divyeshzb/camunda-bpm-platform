package org.camunda.bpm.dmn.engine.impl;

import org.camunda.bpm.dmn.engine.impl.spi.el.ElProvider;
import org.camunda.bpm.dmn.engine.impl.el.JuelElProvider;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class DefaultDmnEngineConfiguration_initElProvider_e7ed92c10f_Test {

    private DefaultDmnEngineConfiguration defaultDmnEngineConfiguration;

    @Before
    public void setup() {
        defaultDmnEngineConfiguration = new DefaultDmnEngineConfiguration();
    }

    @Test
    public void testInitElProviderWhenElProviderIsNull() {
        // Setup
        defaultDmnEngineConfiguration.setElProvider(null);

        // Exercise
        defaultDmnEngineConfiguration.initElProvider();

        // Verify
        ElProvider result = defaultDmnEngineConfiguration.getElProvider();
        assertTrue(result instanceof JuelElProvider);
    }

    @Test
    public void testInitElProviderWhenElProviderIsNotNull() {
        // Setup
        ElProvider mockElProvider = mock(ElProvider.class);
        defaultDmnEngineConfiguration.setElProvider(mockElProvider);

        // Exercise
        defaultDmnEngineConfiguration.initElProvider();

        // Verify
        ElProvider result = defaultDmnEngineConfiguration.getElProvider();
        assertSame(mockElProvider, result);
    }
}
