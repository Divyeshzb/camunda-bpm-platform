package org.camunda.bpm.dmn.engine.impl;

import org.camunda.bpm.dmn.engine.impl.spi.el.DmnScriptEngineResolver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class DefaultDmnEngineConfiguration_getScriptEngineResolver_25634dd9ac_Test {

    @InjectMocks
    DefaultDmnEngineConfiguration defaultDmnEngineConfiguration = new DefaultDmnEngineConfiguration();

    @Mock
    DmnScriptEngineResolver scriptEngineResolver;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetScriptEngineResolverSuccess() {
        when(defaultDmnEngineConfiguration.getScriptEngineResolver()).thenReturn(scriptEngineResolver);
        DmnScriptEngineResolver result = defaultDmnEngineConfiguration.getScriptEngineResolver();
        assertEquals(scriptEngineResolver, result);
    }

    @Test
    public void testGetScriptEngineResolverFailure() {
        when(defaultDmnEngineConfiguration.getScriptEngineResolver()).thenReturn(null);
        DmnScriptEngineResolver result = defaultDmnEngineConfiguration.getScriptEngineResolver();
        assertEquals(null, result);
    }
}
