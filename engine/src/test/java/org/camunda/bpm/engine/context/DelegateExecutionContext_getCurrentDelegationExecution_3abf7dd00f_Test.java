package org.camunda.bpm.engine.context;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.impl.persistence.entity.ExecutionEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class DelegateExecutionContext_getCurrentDelegationExecution_3abf7dd00f_Test {

    private ExecutionEntity executionEntity;
    private DelegateExecution delegateExecution;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        executionEntity = mock(ExecutionEntity.class);
        delegateExecution = mock(DelegateExecution.class);
    }

    @Test
    public void testGetCurrentDelegationExecution_success() {
        DelegateExecution result = delegateExecution;
        assertEquals(delegateExecution, result);
    }

    @Test
    public void testGetCurrentDelegationExecution_failure() {
        DelegateExecution result = null;
        assertEquals(null, result);
    }
}
