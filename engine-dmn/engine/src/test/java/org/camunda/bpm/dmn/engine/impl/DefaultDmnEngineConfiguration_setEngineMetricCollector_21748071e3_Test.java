// Test generated by RoostGPT for test Camunda-engine-dmn using AI Type Open AI and AI Model gpt-4

package org.camunda.bpm.dmn.engine.impl;

import org.camunda.bpm.dmn.engine.spi.DmnEngineMetricCollector;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DefaultDmnEngineConfiguration_setEngineMetricCollector_21748071e3_Test {

    @Mock
    private DmnEngineMetricCollector mockEngineMetricCollector;

    private DefaultDmnEngineConfiguration defaultDmnEngineConfiguration;

    @Before
    public void setUp() {
        defaultDmnEngineConfiguration = new DefaultDmnEngineConfiguration();
    }

    @Test
    public void testSetEngineMetricCollector_Success() {
        defaultDmnEngineConfiguration.setEngineMetricCollector(mockEngineMetricCollector);
        assertEquals(mockEngineMetricCollector, defaultDmnEngineConfiguration.getEngineMetricCollector());
    }

    @Test(expected = NullPointerException.class)
    public void testSetEngineMetricCollector_Null() {
        defaultDmnEngineConfiguration.setEngineMetricCollector(null);
    }
}
