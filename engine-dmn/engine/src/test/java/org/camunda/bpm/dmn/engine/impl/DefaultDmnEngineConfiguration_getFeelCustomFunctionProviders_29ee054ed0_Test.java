package org.camunda.bpm.dmn.engine.impl;

import org.camunda.bpm.dmn.feel.impl.scala.function.FeelCustomFunctionProvider;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class DefaultDmnEngineConfiguration_getFeelCustomFunctionProviders_29ee054ed0_Test {

    @InjectMocks
    DefaultDmnEngineConfiguration defaultDmnEngineConfiguration;

    @Mock
    List<FeelCustomFunctionProvider> feelCustomFunctionProviders;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetFeelCustomFunctionProviders_Success() {
        List<FeelCustomFunctionProvider> expectedProviders = new ArrayList<>();
        when(feelCustomFunctionProviders.getFeelCustomFunctionProviders()).thenReturn(expectedProviders);
        List<FeelCustomFunctionProvider> actualProviders = defaultDmnEngineConfiguration.getFeelCustomFunctionProviders();
        assertEquals(expectedProviders, actualProviders);
    }

    @Test
    public void testGetFeelCustomFunctionProviders_Null() {
        when(feelCustomFunctionProviders.getFeelCustomFunctionProviders()).thenReturn(null);
        List<FeelCustomFunctionProvider> actualProviders = defaultDmnEngineConfiguration.getFeelCustomFunctionProviders();
        assertEquals(null, actualProviders);
    }
}
