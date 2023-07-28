package org.camunda.bpm.dmn.engine.impl;

import org.camunda.bpm.dmn.engine.delegate.DmnDecisionEvaluationListener;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class DefaultDmnEngineConfiguration_setCustomPostDecisionEvaluationListeners_1eb76d1a94_Test {

    private DefaultDmnEngineConfiguration configuration;

    @Before
    public void setup() {
        configuration = new DefaultDmnEngineConfiguration();
    }

    @Test
    public void testSetCustomPostDecisionEvaluationListeners() {
        List<DmnDecisionEvaluationListener> mockListeners = new ArrayList<>();
        DmnDecisionEvaluationListener mockListener = Mockito.mock(DmnDecisionEvaluationListener.class);
        mockListeners.add(mockListener);

        configuration.setCustomPostDecisionEvaluationListeners(mockListeners);

        List<DmnDecisionEvaluationListener> resultListeners = configuration.getCustomPostDecisionEvaluationListeners();
        assertNotNull(resultListeners);
        assertEquals(1, resultListeners.size());
        assertEquals(mockListener, resultListeners.get(0));
    }

    @Test
    public void testSetCustomPostDecisionEvaluationListeners_Null() {
        configuration.setCustomPostDecisionEvaluationListeners(null);

        List<DmnDecisionEvaluationListener> resultListeners = configuration.getCustomPostDecisionEvaluationListeners();
        assertNull(resultListeners);
    }
}
