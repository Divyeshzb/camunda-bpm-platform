package org.camunda.bpm.dmn.engine.impl;

import org.camunda.bpm.dmn.engine.impl.spi.transform.DmnTransformer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class DefaultDmnEngineConfiguration_getTransformer_9caaa9c930_Test {

    @InjectMocks
    DefaultDmnEngineConfiguration defaultDmnEngineConfiguration = new DefaultDmnEngineConfiguration();

    @Mock
    DmnTransformer transformer;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetTransformer() {
        when(defaultDmnEngineConfiguration.getTransformer()).thenReturn(transformer);
        DmnTransformer result = defaultDmnEngineConfiguration.getTransformer();
        assertEquals(transformer, result, "Transformer should match the mock transformer");
    }

    @Test
    public void testGetTransformer_null() {
        when(defaultDmnEngineConfiguration.getTransformer()).thenReturn(null);
        DmnTransformer result = defaultDmnEngineConfiguration.getTransformer();
        assertEquals(null, result, "Transformer should be null");
    }
}
