package org.camunda.bpm.dmn.engine.impl;

import org.camunda.bpm.dmn.engine.impl.el.DefaultScriptEngineResolver;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class DefaultDmnEngineConfiguration_initScriptEngineResolver_3ea497e2ed_Test {

    private DefaultDmnEngineConfiguration defaultDmnEngineConfiguration;
    private DefaultScriptEngineResolver scriptEngineResolver;

    @Before
    public void setUp() {
        defaultDmnEngineConfiguration = new DefaultDmnEngineConfiguration();
        scriptEngineResolver = Mockito.mock(DefaultScriptEngineResolver.class);
    }

    @Test
    public void testInitScriptEngineResolver_WhenScriptEngineResolverIsNull() {
        defaultDmnEngineConfiguration.initScriptEngineResolver();
        assertNotNull(defaultDmnEngineConfiguration.getScriptEngineResolver());
    }

    @Test
    public void testInitScriptEngineResolver_WhenScriptEngineResolverIsNotNull() {
        defaultDmnEngineConfiguration.setScriptEngineResolver(scriptEngineResolver);
        defaultDmnEngineConfiguration.initScriptEngineResolver();
        assertEquals(scriptEngineResolver, defaultDmnEngineConfiguration.getScriptEngineResolver());
    }
}
