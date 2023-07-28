package org.camunda.bpm.dmn.engine.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DefaultDmnEngineConfiguration_getDefaultInputEntryExpressionLanguage_66da4e24e3_Test {

    private DefaultDmnEngineConfiguration defaultDmnEngineConfiguration;

    @BeforeEach
    public void setUp() {
        defaultDmnEngineConfiguration = new DefaultDmnEngineConfiguration();
    }

    @Test
    public void testGetDefaultInputEntryExpressionLanguage_WhenDefaultValue() {
        String expectedLanguage = DmnModelConstants.DEFAULT_EXPRESSION_LANGUAGE;
        defaultDmnEngineConfiguration.setDefaultInputEntryExpressionLanguage(expectedLanguage);
        String actualLanguage = defaultDmnEngineConfiguration.getDefaultInputEntryExpressionLanguage();
        assertEquals(expectedLanguage, actualLanguage);
    }

    @Test
    public void testGetDefaultInputEntryExpressionLanguage_WhenCustomValue() {
        String expectedLanguage = "CustomLanguage";
        defaultDmnEngineConfiguration.setDefaultInputEntryExpressionLanguage(expectedLanguage);
        String actualLanguage = defaultDmnEngineConfiguration.getDefaultInputEntryExpressionLanguage();
        assertEquals(expectedLanguage, actualLanguage);
    }
}
