package org.camunda.bpm.dmn.engine.impl;

import org.camunda.bpm.dmn.engine.impl.metrics.DmnEngineMetricCollectorWrapper;
import org.camunda.bpm.dmn.engine.spi.DmnEngineMetricCollector;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class DefaultDmnEngineConfiguration_getEngineMetricCollector_47302e6d2e_Test {

    @InjectMocks
    DefaultDmnEngineConfiguration defaultDmnEngineConfiguration;

    @Mock
    DmnEngineMetricCollectorWrapper engineMetricCollectorWrapper;

    @Before
    public void setUp() {
        defaultDmnEngineConfiguration.setEngineMetricCollector(engineMetricCollectorWrapper);
    }

    @Test
    public void testGetEngineMetricCollector_success() {
        DmnEngineMetricCollector result = defaultDmnEngineConfiguration.getEngineMetricCollector();
        assertEquals(engineMetricCollectorWrapper, result);
    }

    @Test(expected = NullPointerException.class)
    public void testGetEngineMetricCollector_null() {
        defaultDmnEngineConfiguration.setEngineMetricCollector(null);
        defaultDmnEngineConfiguration.getEngineMetricCollector();
    }
}
