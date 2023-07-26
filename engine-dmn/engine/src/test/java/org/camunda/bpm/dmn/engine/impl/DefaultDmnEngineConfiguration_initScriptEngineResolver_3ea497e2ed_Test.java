package org.camunda.bpm.dmn.engine.impl;

import org.camunda.bpm.dmn.engine.impl.el.DefaultScriptEngineResolver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class DefaultDmnEngineConfiguration_initScriptEngineResolver_3ea497e2ed_Test {

    @InjectMocks
    private DefaultDmnEngineConfiguration defaultDmnEngineConfiguration;

    @Mock
    private DefaultScriptEngineResolver defaultScriptEngineResolver;

    @BeforeEach
    public void setup() {
        defaultDmnEngineConfiguration = new DefaultDmnEngineConfiguration();
    }

    @Test
    public void testInitScriptEngineResolverWhenNull() {
        defaultDmnEngineConfiguration.initScriptEngineResolver();
        assertNotNull(defaultDmnEngineConfiguration.getScriptEngineResolver());
    }

    @Test
    public void testInitScriptEngineResolverWhenNotNull() {
        when(defaultScriptEngineResolver.getScriptEngineName()).thenReturn("MockEngine");
        defaultDmnEngineConfiguration.setScriptEngineResolver(defaultScriptEngineResolver);
        defaultDmnEngineConfiguration.initScriptEngineResolver();
        assertNotNull(defaultDmnEngineConfiguration.getScriptEngineResolver());
        assertEquals("MockEngine", defaultDmnEngineConfiguration.getScriptEngineResolver().getScriptEngineName());
    }
}
