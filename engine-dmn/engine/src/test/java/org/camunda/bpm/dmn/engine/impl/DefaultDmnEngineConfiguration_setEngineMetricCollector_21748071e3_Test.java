package org.camunda.bpm.dmn.engine.impl;

import org.camunda.bpm.dmn.engine.impl.metrics.DefaultEngineMetricCollector;
import org.camunda.bpm.dmn.engine.impl.metrics.DmnEngineMetricCollectorWrapper;
import org.camunda.bpm.dmn.engine.spi.DmnEngineMetricCollector;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DefaultDmnEngineConfiguration_setEngineMetricCollector_21748071e3_Test {

    private DefaultDmnEngineConfiguration defaultDmnEngineConfiguration;

    @Before
    public void setUp() {
        defaultDmnEngineConfiguration = new DefaultDmnEngineConfiguration();
    }

    @Test
    public void testSetEngineMetricCollector_Success() {
        DmnEngineMetricCollector engineMetricCollector = new DefaultEngineMetricCollector();
        defaultDmnEngineConfiguration.setEngineMetricCollector(engineMetricCollector);
        assertEquals(engineMetricCollector, defaultDmnEngineConfiguration.getEngineMetricCollector());
    }

    @Test
    public void testSetEngineMetricCollector_Null() {
        defaultDmnEngineConfiguration.setEngineMetricCollector(null);
        assertNull(defaultDmnEngineConfiguration.getEngineMetricCollector());
    }
    
    @Test
    public void testSetEngineMetricCollector_Wrapper() {
        DmnEngineMetricCollector engineMetricCollector = new DmnEngineMetricCollectorWrapper(new DefaultEngineMetricCollector());
        defaultDmnEngineConfiguration.setEngineMetricCollector(engineMetricCollector);
        assertEquals(engineMetricCollector, defaultDmnEngineConfiguration.getEngineMetricCollector());
    }
}
