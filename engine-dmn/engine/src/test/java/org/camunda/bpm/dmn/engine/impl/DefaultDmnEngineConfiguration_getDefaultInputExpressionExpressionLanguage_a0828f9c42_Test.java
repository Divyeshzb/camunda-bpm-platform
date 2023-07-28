package org.camunda.bpm.dmn.engine.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DefaultDmnEngineConfiguration_getDefaultInputExpressionExpressionLanguage_a0828f9c42_Test {

    private DefaultDmnEngineConfiguration defaultDmnEngineConfiguration;

    @Before
    public void setUp() {
        defaultDmnEngineConfiguration = new DefaultDmnEngineConfiguration();
    }

    @Test
    public void testGetDefaultInputExpressionExpressionLanguage_Success() {
        String expected = "ExpectedValue";
        defaultDmnEngineConfiguration.setDefaultInputExpressionExpressionLanguage(expected);
        String actual = defaultDmnEngineConfiguration.getDefaultInputExpressionExpressionLanguage();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetDefaultInputExpressionExpressionLanguage_Null() {
        String actual = defaultDmnEngineConfiguration.getDefaultInputExpressionExpressionLanguage();
        Assert.assertNull(actual);
    }
}
