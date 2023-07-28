package org.camunda.bpm.dmn.engine.impl;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.camunda.bpm.dmn.engine.DmnDecisionEvaluationListener;
import org.camunda.bpm.dmn.engine.impl.metrics.DmnEngineMetricCollectorWrapper;
import org.camunda.bpm.dmn.engine.spi.DmnEngineMetricCollector;

import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DefaultDmnEngineConfiguration_getDefaultDmnDecisionEvaluationListeners_797fa63b80_Test {

    @Mock
    private DmnEngineMetricCollector engineMetricCollector;

    private DefaultDmnEngineConfiguration defaultDmnEngineConfiguration;

    @Before
    public void setUp() {
        defaultDmnEngineConfiguration = new DefaultDmnEngineConfiguration();
        defaultDmnEngineConfiguration.setEngineMetricCollector(engineMetricCollector);
    }

    @Test
    public void testGetDefaultDmnDecisionEvaluationListeners_MetricCollectorIsListener() {
        when(engineMetricCollector instanceof DmnDecisionEvaluationListener).thenReturn(true);

        Collection<? extends DmnDecisionEvaluationListener> listeners = defaultDmnEngineConfiguration.getDefaultDmnDecisionEvaluationListeners();

        assertEquals(1, listeners.size());
        assertTrue(listeners.iterator().next() instanceof DmnDecisionEvaluationListener);
    }

    @Test
    public void testGetDefaultDmnDecisionEvaluationListeners_MetricCollectorIsNotListener() {
        when(engineMetricCollector instanceof DmnDecisionEvaluationListener).thenReturn(false);

        Collection<? extends DmnDecisionEvaluationListener> listeners = defaultDmnEngineConfiguration.getDefaultDmnDecisionEvaluationListeners();

        assertEquals(1, listeners.size());
        assertTrue(listeners.iterator().next() instanceof DmnEngineMetricCollectorWrapper);
    }
}
