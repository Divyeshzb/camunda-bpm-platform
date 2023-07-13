package org.camunda.bpm.engine.context;

import org.camunda.bpm.engine.impl.context.ProcessEngineContextImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ProcessEngineContext_clear_17e24613c4_Test {

    private ProcessEngineContextImpl processEngineContextImpl;

    @BeforeEach
    public void setup() {
        processEngineContextImpl = mock(ProcessEngineContextImpl.class);
        doNothing().when(processEngineContextImpl).clear();
    }

    @Test
    public void testClear_Success() {
        processEngineContextImpl.clear();
        verify(processEngineContextImpl, Mockito.times(1)).clear();
    }

    @Test
    public void testClear_Failure() {
        verify(processEngineContextImpl, Mockito.never()).clear();
    }
}
