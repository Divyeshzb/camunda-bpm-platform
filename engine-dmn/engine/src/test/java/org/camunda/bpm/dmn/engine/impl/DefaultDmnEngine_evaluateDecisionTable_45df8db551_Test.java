package org.camunda.bpm.dmn.engine.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.camunda.bpm.dmn.engine.DmnDecision;
import org.camunda.bpm.dmn.engine.DmnDecisionTableResult;
import org.camunda.bpm.engine.variable.context.VariableContext;
import org.camunda.bpm.model.dmn.DmnModelInstance;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;

public class DefaultDmnEngine_evaluateDecisionTable_45df8db551_Test {

    private DefaultDmnEngine engine;
    private DmnModelInstance dmnModelInstance;
    private VariableContext variableContext;
    private DmnDecision decision1, decision2;
    private DmnDecisionTableResult decisionTableResult;

    @Before
    public void setup() {
        engine = new DefaultDmnEngine();
        dmnModelInstance = mock(DmnModelInstance.class);
        variableContext = mock(VariableContext.class);
        decision1 = mock(DmnDecision.class);
        decision2 = mock(DmnDecision.class);
        decisionTableResult = mock(DmnDecisionTableResult.class);

        when(decision1.getKey()).thenReturn("key1");
        when(decision2.getKey()).thenReturn("key2");
        when(engine.parseDecisions(dmnModelInstance)).thenReturn(Arrays.asList(decision1, decision2));
        when(engine.evaluateDecisionTable(decision1, variableContext)).thenReturn(decisionTableResult);
    }

    @Test
    public void testEvaluateDecisionTable_Success() {
        DmnDecisionTableResult result = engine.evaluateDecisionTable("key1", dmnModelInstance, variableContext);
        assertEquals(decisionTableResult, result);
    }

    @Test
    public void testEvaluateDecisionTable_Failure() {
        Exception exception = assertThrows(DmnEngineException.class, () -> {
            engine.evaluateDecisionTable("key3", dmnModelInstance, variableContext);
        });
        assertEquals("Unable to find decision with key: key3", exception.getMessage());
    }
}
