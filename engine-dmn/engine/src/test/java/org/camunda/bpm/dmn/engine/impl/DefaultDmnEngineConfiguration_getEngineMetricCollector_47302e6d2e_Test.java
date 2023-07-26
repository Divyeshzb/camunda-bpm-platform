package org.camunda.bpm.dmn.engine.impl;

import org.camunda.bpm.dmn.engine.impl.metrics.DmnEngineMetricCollectorWrapper;
import org.camunda.bpm.dmn.engine.spi.DmnEngineMetricCollector;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DefaultDmnEngineConfiguration_getEngineMetricCollector_47302e6d2e_Test {

    @Mock
    private DmnEngineMetricCollectorWrapper engineMetricCollectorWrapper;

    private DefaultDmnEngineConfiguration defaultDmnEngineConfiguration;

    @Before
    public void setUp() {
        defaultDmnEngineConfiguration = new DefaultDmnEngineConfiguration();
        defaultDmnEngineConfiguration.setEngineMetricCollector(engineMetricCollectorWrapper);
    }

    @Test
    public void testGetEngineMetricCollector() {
        DmnEngineMetricCollector result = defaultDmnEngineConfiguration.getEngineMetricCollector();
        assertEquals(engineMetricCollectorWrapper, result);
    }

    @Test
    public void testGetEngineMetricCollector_Null() {
        defaultDmnEngineConfiguration.setEngineMetricCollector(null);
        DmnEngineMetricCollector result = defaultDmnEngineConfiguration.getEngineMetricCollector();
        assertEquals(null, result);
    }
}
