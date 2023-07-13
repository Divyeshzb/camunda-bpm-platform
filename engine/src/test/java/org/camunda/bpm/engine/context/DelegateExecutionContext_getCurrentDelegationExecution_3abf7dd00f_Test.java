package org.camunda.bpm.engine.context;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.impl.context.BpmnExecutionContext;
import org.camunda.bpm.engine.impl.context.Context;
import org.camunda.bpm.engine.impl.persistence.entity.ExecutionEntity;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest({Context.class})
public class DelegateExecutionContext_getCurrentDelegationExecution_3abf7dd00f_Test {

    @Mock
    private BpmnExecutionContext bpmnExecutionContext;

    @Mock
    private ExecutionEntity executionEntity;

    @Before
    public void setUp() throws Exception {
        PowerMockito.mockStatic(Context.class);
    }

    @Test
    public void testGetCurrentDelegationExecution_Success() {
        when(Context.getBpmnExecutionContext()).thenReturn(bpmnExecutionContext);
        when(bpmnExecutionContext.getExecution()).thenReturn(executionEntity);
        DelegateExecution result = Context.getCurrentDelegationExecution();
        assertEquals(executionEntity, result);
    }

    @Test
    public void testGetCurrentDelegationExecution_NullContext() {
        when(Context.getBpmnExecutionContext()).thenReturn(null);
        DelegateExecution result = Context.getCurrentDelegationExecution();
        assertNull(result);
    }
}
