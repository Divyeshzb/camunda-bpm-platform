package org.camunda.bpm.dmn.engine.impl;

import org.camunda.bpm.dmn.engine.delegate.DmnDecisionEvaluationListener;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DefaultDmnEngineConfiguration_getDecisionEvaluationListeners_bf1dd2cbe1_Test {

    private DefaultDmnEngineConfiguration defaultDmnEngineConfiguration;

    @Before
    public void setUp() {
        defaultDmnEngineConfiguration = new DefaultDmnEngineConfiguration();
    }

    @Test
    public void testGetDecisionEvaluationListenersWhenListIsNotNull() {
        List<DmnDecisionEvaluationListener> listeners = new ArrayList<>();
        listeners.add(event -> {});
        listeners.add(event -> {});
        defaultDmnEngineConfiguration.setDecisionEvaluationListeners(listeners);

        List<DmnDecisionEvaluationListener> result = defaultDmnEngineConfiguration.getDecisionEvaluationListeners();

        assertNotNull(result);
        assertEquals(2, result.size());
    }

    @Test
    public void testGetDecisionEvaluationListenersWhenListIsNull() {
        defaultDmnEngineConfiguration.setDecisionEvaluationListeners(null);

        List<DmnDecisionEvaluationListener> result = defaultDmnEngineConfiguration.getDecisionEvaluationListeners();

        assertNotNull(result);
        assertEquals(0, result.size());
    }
}
