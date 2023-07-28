// Test generated by RoostGPT for test Camunda-engine-dmn using AI Type Open AI and AI Model gpt-4

package org.camunda.bpm.dmn.engine.impl;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class DefaultDmnEngineConfiguration_initElDefaults_d2ddd42974_Test {

    @Mock
    private DefaultDmnEngineConfiguration defaultDmnEngineConfiguration;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testInitElDefaults_withEnableFeelLegacyBehavior() {
        when(defaultDmnEngineConfiguration.getEnableFeelLegacyBehavior()).thenReturn(true);

        defaultDmnEngineConfiguration.initElDefaults();

        assertEquals(DefaultDmnEngineConfiguration.JUEL_EXPRESSION_LANGUAGE, defaultDmnEngineConfiguration.getDefaultInputExpressionExpressionLanguage());
        assertEquals(DefaultDmnEngineConfiguration.FEEL_EXPRESSION_LANGUAGE, defaultDmnEngineConfiguration.getDefaultInputEntryExpressionLanguage());
        assertEquals(DefaultDmnEngineConfiguration.JUEL_EXPRESSION_LANGUAGE, defaultDmnEngineConfiguration.getDefaultOutputEntryExpressionLanguage());
        assertEquals(DefaultDmnEngineConfiguration.JUEL_EXPRESSION_LANGUAGE, defaultDmnEngineConfiguration.getDefaultLiteralExpressionLanguage());
    }

    @Test
    public void testInitElDefaults_withoutEnableFeelLegacyBehavior() {
        when(defaultDmnEngineConfiguration.getEnableFeelLegacyBehavior()).thenReturn(false);

        defaultDmnEngineConfiguration.initElDefaults();

        assertEquals(DefaultDmnEngineConfiguration.FEEL_EXPRESSION_LANGUAGE, defaultDmnEngineConfiguration.getDefaultInputExpressionExpressionLanguage());
        assertEquals(DefaultDmnEngineConfiguration.FEEL_EXPRESSION_LANGUAGE, defaultDmnEngineConfiguration.getDefaultInputEntryExpressionLanguage());
        assertEquals(DefaultDmnEngineConfiguration.FEEL_EXPRESSION_LANGUAGE, defaultDmnEngineConfiguration.getDefaultOutputEntryExpressionLanguage());
        assertEquals(DefaultDmnEngineConfiguration.FEEL_EXPRESSION_LANGUAGE, defaultDmnEngineConfiguration.getDefaultLiteralExpressionLanguage());
    }
}
