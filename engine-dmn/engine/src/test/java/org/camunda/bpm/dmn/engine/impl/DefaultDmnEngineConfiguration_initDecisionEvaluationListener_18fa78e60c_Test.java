package org.camunda.bpm.dmn.engine.impl;

import org.camunda.bpm.dmn.engine.delegate.DmnDecisionEvaluationListener;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DefaultDmnEngineConfiguration_initDecisionEvaluationListener_18fa78e60c_Test {

    @Mock
    private ArrayList<DmnDecisionEvaluationListener> customPreDecisionEvaluationListeners;
    @Mock
    private ArrayList<DmnDecisionEvaluationListener> customPostDecisionEvaluationListeners;

    private DefaultDmnEngineConfiguration defaultDmnEngineConfiguration;

    @Before
    public void setUp() {
        defaultDmnEngineConfiguration = new DefaultDmnEngineConfiguration();
    }

    @Test
    public void testInitDecisionEvaluationListener_withCustomPreAndPostDecisionEvaluationListeners() {
        DmnDecisionEvaluationListener listener1 = Mockito.mock(DmnDecisionEvaluationListener.class);
        DmnDecisionEvaluationListener listener2 = Mockito.mock(DmnDecisionEvaluationListener.class);
        DmnDecisionEvaluationListener listener3 = Mockito.mock(DmnDecisionEvaluationListener.class);
        DmnDecisionEvaluationListener listener4 = Mockito.mock(DmnDecisionEvaluationListener.class);

        when(customPreDecisionEvaluationListeners.isEmpty()).thenReturn(false);
        when(customPreDecisionEvaluationListeners.iterator()).thenReturn(Arrays.asList(listener1, listener2).iterator());

        when(customPostDecisionEvaluationListeners.isEmpty()).thenReturn(false);
        when(customPostDecisionEvaluationListeners.iterator()).thenReturn(Arrays.asList(listener3, listener4).iterator());

        defaultDmnEngineConfiguration.initDecisionEvaluationListener();

        assertEquals(4, defaultDmnEngineConfiguration.getDecisionEvaluationListeners().size());
    }

    @Test
    public void testInitDecisionEvaluationListener_withoutCustomPreAndPostDecisionEvaluationListeners() {
        when(customPreDecisionEvaluationListeners.isEmpty()).thenReturn(true);
        when(customPostDecisionEvaluationListeners.isEmpty()).thenReturn(true);

        defaultDmnEngineConfiguration.initDecisionEvaluationListener();

        assertEquals(0, defaultDmnEngineConfiguration.getDecisionEvaluationListeners().size());
    }
}
