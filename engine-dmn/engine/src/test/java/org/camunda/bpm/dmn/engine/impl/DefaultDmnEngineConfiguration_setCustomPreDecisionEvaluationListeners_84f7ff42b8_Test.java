package org.camunda.bpm.dmn.engine.impl;

import org.camunda.bpm.dmn.engine.delegate.DmnDecisionEvaluationListener;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class DefaultDmnEngineConfiguration_setCustomPreDecisionEvaluationListeners_84f7ff42b8_Test {

    private DefaultDmnEngineConfiguration defaultDmnEngineConfiguration;

    @Before
    public void setUp() {
        defaultDmnEngineConfiguration = new DefaultDmnEngineConfiguration();
    }

    @Test
    public void testSetCustomPreDecisionEvaluationListeners_Success() {
        List<DmnDecisionEvaluationListener> decisionEvaluationListeners = new ArrayList<>();
        DmnDecisionEvaluationListener mockListener = Mockito.mock(DmnDecisionEvaluationListener.class);
        decisionEvaluationListeners.add(mockListener);

        defaultDmnEngineConfiguration.setCustomPreDecisionEvaluationListeners(decisionEvaluationListeners);

        assertEquals(decisionEvaluationListeners, defaultDmnEngineConfiguration.getCustomPreDecisionEvaluationListeners());
    }

    @Test
    public void testSetCustomPreDecisionEvaluationListeners_Null() {
        defaultDmnEngineConfiguration.setCustomPreDecisionEvaluationListeners(null);

        assertNull(defaultDmnEngineConfiguration.getCustomPreDecisionEvaluationListeners());
    }
}
