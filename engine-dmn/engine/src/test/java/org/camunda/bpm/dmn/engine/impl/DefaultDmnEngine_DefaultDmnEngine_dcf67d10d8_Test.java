package org.camunda.bpm.dmn.engine.impl;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

import org.camunda.bpm.dmn.engine.impl.spi.transform.DmnTransformer;
import org.junit.Before;
import org.junit.Test;

public class DefaultDmnEngine_DefaultDmnEngine_dcf67d10d8_Test {

    private DefaultDmnEngineConfiguration dmnEngineConfiguration;
    private DmnTransformer transformer;

    @Before
    public void setUp() {
        dmnEngineConfiguration = new DefaultDmnEngineConfiguration();
        transformer = new DmnTransformer();
    }

    @Test
    public void testDefaultDmnEngine_Success() {
        DefaultDmnEngine defaultDmnEngine = new DefaultDmnEngine();
        assertNotNull(defaultDmnEngine);
    }

    @Test(expected = NullPointerException.class)
    public void testDefaultDmnEngine_NullConfiguration() {
        dmnEngineConfiguration = null;
        new DefaultDmnEngine();
    }

    @Test(expected = NullPointerException.class)
    public void testDefaultDmnEngine_NullTransformerInConfiguration() {
        transformer = null;
        new DefaultDmnEngine();
    }
}
