package org.camunda.bpm.dmn.engine.impl;

import java.util.List;
import org.camunda.bpm.dmn.engine.delegate.DmnDecisionEvaluationListener;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class DefaultDmnEngineConfiguration_getCustomPreDecisionEvaluationListeners_1062b91067_Test {

    private DefaultDmnEngineConfiguration defaultDmnEngineConfiguration;
    private List<DmnDecisionEvaluationListener> customPreDecisionEvaluationListeners;

    @BeforeEach
    public void setup() {
        defaultDmnEngineConfiguration = Mockito.mock(DefaultDmnEngineConfiguration.class);
        customPreDecisionEvaluationListeners = Mockito.mock(List.class);
        when(defaultDmnEngineConfiguration.getCustomPreDecisionEvaluationListeners()).thenReturn(customPreDecisionEvaluationListeners);
    }

    @Test
    public void testGetCustomPreDecisionEvaluationListenersSuccess() {
        List<DmnDecisionEvaluationListener> result = defaultDmnEngineConfiguration.getCustomPreDecisionEvaluationListeners();
        assertEquals(customPreDecisionEvaluationListeners, result);
    }

    @Test
    public void testGetCustomPreDecisionEvaluationListenersFailure() {
        when(defaultDmnEngineConfiguration.getCustomPreDecisionEvaluationListeners()).thenThrow(new RuntimeException());
        assertThrows(RuntimeException.class, () -> defaultDmnEngineConfiguration.getCustomPreDecisionEvaluationListeners());
    }
}
