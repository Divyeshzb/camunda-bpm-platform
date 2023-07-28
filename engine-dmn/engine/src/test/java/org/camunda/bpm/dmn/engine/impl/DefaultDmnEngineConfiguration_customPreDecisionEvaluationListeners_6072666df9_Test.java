package org.camunda.bpm.dmn.engine.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.camunda.bpm.dmn.engine.delegate.DmnDecisionEvaluationListener;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

public class DefaultDmnEngineConfiguration_customPreDecisionEvaluationListeners_6072666df9_Test {

    private DefaultDmnEngineConfiguration defaultDmnEngineConfiguration;

    @Mock
    private DmnDecisionEvaluationListener mockListener1;

    @Mock
    private DmnDecisionEvaluationListener mockListener2;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        defaultDmnEngineConfiguration = new DefaultDmnEngineConfiguration();
    }

    @Test
    public void testCustomPreDecisionEvaluationListeners() {
        List<DmnDecisionEvaluationListener> decisionEvaluationListeners = Arrays.asList(mockListener1, mockListener2);
        defaultDmnEngineConfiguration.customPreDecisionEvaluationListeners(decisionEvaluationListeners);

        assertEquals(decisionEvaluationListeners, defaultDmnEngineConfiguration.getCustomPreDecisionEvaluationListeners());
    }

    @Test
    public void testCustomPreDecisionEvaluationListeners_NullList() {
        defaultDmnEngineConfiguration.customPreDecisionEvaluationListeners(null);

        assertEquals(null, defaultDmnEngineConfiguration.getCustomPreDecisionEvaluationListeners());
    }
}
