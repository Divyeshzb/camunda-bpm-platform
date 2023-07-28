package org.camunda.bpm.dmn.engine.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DefaultDmnEngineConfiguration_getDefaultOutputEntryExpressionLanguage_b24daaa06f_Test {

    private DefaultDmnEngineConfiguration defaultDmnEngineConfiguration;

    @BeforeEach
    public void setUp() {
        defaultDmnEngineConfiguration = Mockito.mock(DefaultDmnEngineConfiguration.class);
        Mockito.when(defaultDmnEngineConfiguration.getDefaultOutputEntryExpressionLanguage()).thenReturn("defaultLanguage");
    }

    @Test
    public void testGetDefaultOutputEntryExpressionLanguage_success() {
        String result = defaultDmnEngineConfiguration.getDefaultOutputEntryExpressionLanguage();
        assertEquals("defaultLanguage", result);
    }

    @Test
    public void testGetDefaultOutputEntryExpressionLanguage_failure() {
        Mockito.when(defaultDmnEngineConfiguration.getDefaultOutputEntryExpressionLanguage()).thenReturn(null);
        String result = defaultDmnEngineConfiguration.getDefaultOutputEntryExpressionLanguage();
        assertEquals(null, result);
    }
}
