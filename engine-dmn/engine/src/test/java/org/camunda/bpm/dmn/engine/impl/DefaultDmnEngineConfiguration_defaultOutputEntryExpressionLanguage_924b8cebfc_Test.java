package org.camunda.bpm.dmn.engine.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class DefaultDmnEngineConfiguration_defaultOutputEntryExpressionLanguage_924b8cebfc_Test {

    private DefaultDmnEngineConfiguration defaultDmnEngineConfiguration;

    @BeforeEach
    public void setUp() {
        defaultDmnEngineConfiguration = new DefaultDmnEngineConfiguration();
    }

    @Test
    public void testDefaultOutputEntryExpressionLanguage_Success() {
        String expressionLanguage = "FEEL";
        defaultDmnEngineConfiguration.defaultOutputEntryExpressionLanguage(expressionLanguage);
        assertEquals(expressionLanguage, defaultDmnEngineConfiguration.getDefaultOutputEntryExpressionLanguage());
    }

    @Test
    public void testDefaultOutputEntryExpressionLanguage_Null() {
        String expressionLanguage = null;
        defaultDmnEngineConfiguration.defaultOutputEntryExpressionLanguage(expressionLanguage);
        assertEquals(expressionLanguage, defaultDmnEngineConfiguration.getDefaultOutputEntryExpressionLanguage());
    }
}
