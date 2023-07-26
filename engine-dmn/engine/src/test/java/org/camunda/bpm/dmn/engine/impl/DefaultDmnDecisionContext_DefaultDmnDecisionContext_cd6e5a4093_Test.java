package org.camunda.bpm.dmn.engine.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.camunda.bpm.dmn.engine.impl.evaluation.DecisionLiteralExpressionEvaluationHandler;
import org.camunda.bpm.dmn.engine.impl.evaluation.DecisionTableEvaluationHandler;
import org.junit.Before;
import org.junit.Test;

public class DefaultDmnDecisionContext_DefaultDmnDecisionContext_cd6e5a4093_Test {

    private DefaultDmnEngineConfiguration configuration;
    private DefaultDmnDecisionContext context;

    @Before
    public void setUp() {
        configuration = mock(DefaultDmnEngineConfiguration.class);
        when(configuration.getDecisionEvaluationListeners()).thenReturn(new ArrayList<DmnDecisionEvaluationListener>());
        context = new DefaultDmnDecisionContext(configuration);
    }

    @Test
    public void testDefaultDmnDecisionContext() {
        assertNotNull(context);
    }

    @Test
    public void testEvaluationHandlers() {
        assertEquals(2, context.getEvaluationHandlers().size());
        assertNotNull(context.getEvaluationHandlers().get(DmnDecisionTableImpl.class));
        assertNotNull(context.getEvaluationHandlers().get(DmnDecisionLiteralExpressionImpl.class));
        assertEquals(DecisionTableEvaluationHandler.class, context.getEvaluationHandlers().get(DmnDecisionTableImpl.class).getClass());
        assertEquals(DecisionLiteralExpressionEvaluationHandler.class, context.getEvaluationHandlers().get(DmnDecisionLiteralExpressionImpl.class).getClass());
    }

    @Test(expected = NullPointerException.class)
    public void testNullConfiguration() {
        new DefaultDmnDecisionContext(null);
    }
}
