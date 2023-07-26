package org.camunda.bpm.dmn.engine.impl;

import java.util.Collection;
import org.camunda.bpm.dmn.engine.DmnEngineMetricCollector;
import org.camunda.bpm.dmn.engine.delegate.DmnDecisionEvaluationListener;
import org.camunda.bpm.dmn.engine.impl.metrics.DefaultEngineMetricCollector;
import org.camunda.bpm.dmn.engine.impl.metrics.DmnEngineMetricCollectorWrapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class DefaultDmnEngineConfiguration_getDefaultDmnDecisionEvaluationListeners_797fa63b80_Test {

    private DefaultDmnEngineConfiguration defaultDmnEngineConfiguration;
    private DmnEngineMetricCollector engineMetricCollector;

    @Before
    public void setUp() {
        defaultDmnEngineConfiguration = new DefaultDmnEngineConfiguration();
        engineMetricCollector = Mockito.mock(DmnEngineMetricCollector.class);
    }

    @Test
    public void testGetDefaultDmnDecisionEvaluationListeners_WithDmnDecisionEvaluationListenerInstance() {
        engineMetricCollector = Mockito.mock(DmnDecisionEvaluationListener.class);
        defaultDmnEngineConfiguration.setEngineMetricCollector(engineMetricCollector);

        Collection<? extends DmnDecisionEvaluationListener> result = defaultDmnEngineConfiguration.getDefaultDmnDecisionEvaluationListeners();

        Assert.assertEquals(1, result.size());
        Assert.assertTrue(result.contains(engineMetricCollector));
    }

    @Test
    public void testGetDefaultDmnDecisionEvaluationListeners_WithNonDmnDecisionEvaluationListenerInstance() {
        defaultDmnEngineConfiguration.setEngineMetricCollector(engineMetricCollector);

        Collection<? extends DmnDecisionEvaluationListener> result = defaultDmnEngineConfiguration.getDefaultDmnDecisionEvaluationListeners();

        Assert.assertEquals(1, result.size());
        Assert.assertTrue(result.iterator().next() instanceof DmnEngineMetricCollectorWrapper);
    }
}
