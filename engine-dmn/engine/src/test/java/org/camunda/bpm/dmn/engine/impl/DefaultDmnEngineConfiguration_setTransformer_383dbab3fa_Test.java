package org.camunda.bpm.dmn.engine.impl;

import org.camunda.bpm.dmn.engine.impl.spi.transform.DmnTransformer;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class DefaultDmnEngineConfiguration_setTransformer_383dbab3fa_Test {

    private DefaultDmnEngineConfiguration configuration;

    @Mock
    private DmnTransformer transformer;

    @Before
    public void setUp() {
        configuration = new DefaultDmnEngineConfiguration();
    }

    @Test
    public void testSetTransformer() {
        configuration.setTransformer(transformer);
        assertEquals(transformer, configuration.getTransformer());
    }

    @Test(expected = NullPointerException.class)
    public void testSetTransformerNull() {
        configuration.setTransformer(null);
    }
}
