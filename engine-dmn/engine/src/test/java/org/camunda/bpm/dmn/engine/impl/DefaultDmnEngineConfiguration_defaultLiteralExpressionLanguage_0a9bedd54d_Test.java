package org.camunda.bpm.dmn.engine.impl;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DefaultDmnEngineConfiguration_defaultLiteralExpressionLanguage_0a9bedd54d_Test {

    private DefaultDmnEngineConfiguration defaultDmnEngineConfiguration;

    @Before
    public void setUp() {
        defaultDmnEngineConfiguration = new DefaultDmnEngineConfiguration();
    }

    @Test
    public void testDefaultLiteralExpressionLanguage_ValidExpressionLanguage() {
        String expressionLanguage = "validExpressionLanguage";
        defaultDmnEngineConfiguration.defaultLiteralExpressionLanguage(expressionLanguage);
        assertEquals(expressionLanguage, defaultDmnEngineConfiguration.getDefaultLiteralExpressionLanguage());
    }

    @Test
    public void testDefaultLiteralExpressionLanguage_NullExpressionLanguage() {
        String expressionLanguage = null;
        defaultDmnEngineConfiguration.defaultLiteralExpressionLanguage(expressionLanguage);
        assertEquals(expressionLanguage, defaultDmnEngineConfiguration.getDefaultLiteralExpressionLanguage());
    }
}
