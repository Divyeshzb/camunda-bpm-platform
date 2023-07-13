package org.camunda.bpm.engine.context;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.impl.context.Context;
import org.camunda.bpm.engine.impl.persistence.entity.ExecutionEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@PrepareForTest({Context.class})
public class DelegateExecutionContext_getCurrentDelegationExecution_3abf7dd00f_Test {

    @Mock
    private ExecutionEntity executionEntity;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        PowerMockito.mockStatic(Context.class);
    }

    @Test
    public void testGetCurrentDelegationExecution_Success() {
        when(Context.getBpmnExecutionContext()).thenReturn(executionEntity);

        DelegateExecution result = Context.getCurrentDelegationExecution();
        assertEquals(executionEntity, result);
    }

    @Test
    public void testGetCurrentDelegationExecution_NullBpmnExecutionContext() {
        when(Context.getBpmnExecutionContext()).thenReturn(null);

        DelegateExecution result = Context.getCurrentDelegationExecution();
        assertEquals(null, result);
    }
}
