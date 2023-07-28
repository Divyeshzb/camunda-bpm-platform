// Test generated by RoostGPT for test Camunda-engine-dmn using AI Type Open AI and AI Model gpt-4

package org.camunda.bpm.dmn.engine.impl;

import org.camunda.bpm.dmn.engine.impl.metrics.DefaultEngineMetricCollector;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DefaultDmnEngineConfiguration_initMetricCollector_4b9982633b_Test {

    private DefaultDmnEngineConfiguration defaultDmnEngineConfiguration;

    @Before
    public void setUp() {
        defaultDmnEngineConfiguration = new DefaultDmnEngineConfiguration();
    }

    @Test
    public void testInitMetricCollectorWhenEngineMetricCollectorIsNull() {
        assertNull(defaultDmnEngineConfiguration.getEngineMetricCollector());

        defaultDmnEngineConfiguration.initMetricCollector();

        assertNotNull(defaultDmnEngineConfiguration.getEngineMetricCollector());
        assertTrue(defaultDmnEngineConfiguration.getEngineMetricCollector() instanceof DefaultEngineMetricCollector);
    }

    @Test
    public void testInitMetricCollectorWhenEngineMetricCollectorIsNotNull() {
        defaultDmnEngineConfiguration.setEngineMetricCollector(new DefaultEngineMetricCollector());
        DefaultEngineMetricCollector initialMetricCollector = defaultDmnEngineConfiguration.getEngineMetricCollector();

        defaultDmnEngineConfiguration.initMetricCollector();

        assertSame(initialMetricCollector, defaultDmnEngineConfiguration.getEngineMetricCollector());
    }
}
