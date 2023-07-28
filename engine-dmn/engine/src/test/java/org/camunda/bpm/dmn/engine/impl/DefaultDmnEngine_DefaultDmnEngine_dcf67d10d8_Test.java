package org.camunda.bpm.dmn.engine.impl;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.camunda.bpm.dmn.engine.impl.spi.transform.DmnTransformer;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultDmnEngine_DefaultDmnEngine_dcf67d10d8_Test {

    @Mock
    private DefaultDmnEngineConfiguration mockDmnEngineConfiguration;

    @Mock
    private DmnTransformer mockTransformer;

    @InjectMocks
    private DefaultDmnEngine defaultDmnEngine;

    @Before
    public void setUp() {
        when(mockDmnEngineConfiguration.getTransformer()).thenReturn(mockTransformer);
    }

    @Test
    public void testDefaultDmnEngine_Success() {
        // TODO: Change the values if needed
        DefaultDmnEngine dmnEngine = new DefaultDmnEngine();
        assertEquals(mockDmnEngineConfiguration, dmnEngine.getDmnEngineConfiguration());
        assertEquals(mockTransformer, dmnEngine.getTransformer());
    }

    @Test(expected = NullPointerException.class)
    public void testDefaultDmnEngine_NullConfiguration() {
        // TODO: Change the values if needed
        DefaultDmnEngine dmnEngine = new DefaultDmnEngine();
    }
}
