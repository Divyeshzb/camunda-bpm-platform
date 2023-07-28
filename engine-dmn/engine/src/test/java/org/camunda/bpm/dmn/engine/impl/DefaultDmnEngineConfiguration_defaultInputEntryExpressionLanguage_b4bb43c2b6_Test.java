package org.camunda.bpm.dmn.engine.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DefaultDmnEngineConfiguration_defaultInputEntryExpressionLanguage_b4bb43c2b6_Test {

    private DefaultDmnEngineConfiguration defaultDmnEngineConfiguration;

    @BeforeEach
    public void setup() {
        defaultDmnEngineConfiguration = new DefaultDmnEngineConfiguration();
    }

    @Test
    public void testDefaultInputEntryExpressionLanguage_ValidInput() {
        String expressionLanguage = "testLanguage";
        defaultDmnEngineConfiguration.defaultInputEntryExpressionLanguage(expressionLanguage);
        assertEquals(expressionLanguage, defaultDmnEngineConfiguration.getDefaultInputEntryExpressionLanguage());
    }

    @Test
    public void testDefaultInputEntryExpressionLanguage_NullInput() {
        String expressionLanguage = null;
        defaultDmnEngineConfiguration.defaultInputEntryExpressionLanguage(expressionLanguage);
        assertEquals(expressionLanguage, defaultDmnEngineConfiguration.getDefaultInputEntryExpressionLanguage());
    }
}
