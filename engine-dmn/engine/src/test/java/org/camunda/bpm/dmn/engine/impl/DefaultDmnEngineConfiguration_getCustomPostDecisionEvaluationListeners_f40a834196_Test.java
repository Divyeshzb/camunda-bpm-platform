package org.camunda.bpm.dmn.engine.impl;

import java.util.ArrayList;
import java.util.List;
import org.camunda.bpm.dmn.engine.delegate.DmnDecisionEvaluationListener;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class DefaultDmnEngineConfiguration_getCustomPostDecisionEvaluationListeners_f40a834196_Test {

    private DefaultDmnEngineConfiguration defaultDmnEngineConfiguration;

    @Before
    public void setUp() {
        defaultDmnEngineConfiguration = new DefaultDmnEngineConfiguration();
    }

    @Test
    public void testGetCustomPostDecisionEvaluationListeners_emptyList() {
        List<DmnDecisionEvaluationListener> expectedListeners = new ArrayList<>();
        defaultDmnEngineConfiguration.setCustomPostDecisionEvaluationListeners(expectedListeners);
        List<DmnDecisionEvaluationListener> actualListeners = defaultDmnEngineConfiguration.getCustomPostDecisionEvaluationListeners();
        Assert.assertEquals(expectedListeners, actualListeners);
    }

    @Test
    public void testGetCustomPostDecisionEvaluationListeners_nonEmptyList() {
        DmnDecisionEvaluationListener listener = Mockito.mock(DmnDecisionEvaluationListener.class);
        List<DmnDecisionEvaluationListener> expectedListeners = new ArrayList<>();
        expectedListeners.add(listener);
        defaultDmnEngineConfiguration.setCustomPostDecisionEvaluationListeners(expectedListeners);
        List<DmnDecisionEvaluationListener> actualListeners = defaultDmnEngineConfiguration.getCustomPostDecisionEvaluationListeners();
        Assert.assertEquals(expectedListeners, actualListeners);
    }
}
