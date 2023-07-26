package org.camunda.bpm.dmn.engine.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class DefaultDmnEngineConfiguration_initElDefaults_d2ddd42974_Test {

    @InjectMocks
    private DefaultDmnEngineConfiguration defaultDmnEngineConfiguration;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testInitElDefaults_WithEnableFeelLegacyBehavior() {
        defaultDmnEngineConfiguration.setEnableFeelLegacyBehavior(true);
        defaultDmnEngineConfiguration.initElDefaults();

        assertEquals(defaultDmnEngineConfiguration.getDefaultInputExpressionExpressionLanguage(), DefaultDmnEngineConfiguration.JUEL_EXPRESSION_LANGUAGE);
        assertEquals(defaultDmnEngineConfiguration.getDefaultInputEntryExpressionLanguage(), DefaultDmnEngineConfiguration.FEEL_EXPRESSION_LANGUAGE);
        assertEquals(defaultDmnEngineConfiguration.getDefaultOutputEntryExpressionLanguage(), DefaultDmnEngineConfiguration.JUEL_EXPRESSION_LANGUAGE);
        assertEquals(defaultDmnEngineConfiguration.getDefaultLiteralExpressionLanguage(), DefaultDmnEngineConfiguration.JUEL_EXPRESSION_LANGUAGE);
    }

    @Test
    public void testInitElDefaults_WithoutEnableFeelLegacyBehavior() {
        defaultDmnEngineConfiguration.setEnableFeelLegacyBehavior(false);
        defaultDmnEngineConfiguration.initElDefaults();

        assertEquals(defaultDmnEngineConfiguration.getDefaultInputExpressionExpressionLanguage(), DefaultDmnEngineConfiguration.FEEL_EXPRESSION_LANGUAGE);
        assertEquals(defaultDmnEngineConfiguration.getDefaultInputEntryExpressionLanguage(), DefaultDmnEngineConfiguration.FEEL_EXPRESSION_LANGUAGE);
        assertEquals(defaultDmnEngineConfiguration.getDefaultOutputEntryExpressionLanguage(), DefaultDmnEngineConfiguration.FEEL_EXPRESSION_LANGUAGE);
        assertEquals(defaultDmnEngineConfiguration.getDefaultLiteralExpressionLanguage(), DefaultDmnEngineConfiguration.FEEL_EXPRESSION_LANGUAGE);
    }
}
