package org.camunda.bpm.engine.context;

import org.camunda.bpm.engine.impl.context.ProcessEngineContextImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Mockito;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;

public class ProcessEngineContext_clear_17e24613c4_Test {

    @Mock
    private ProcessEngineContextImpl processEngineContext;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testClear_Success() throws Exception {
        doNothing().when(processEngineContext).clear();

        processEngineContext.clear();

        verify(processEngineContext, Mockito.times(1)).clear();
    }

    @Test
    public void testClear_Failure() throws Exception {
        doNothing().when(processEngineContext).clear();

        try {
            processEngineContext.clear();
        } catch (Exception e) {
            verify(processEngineContext, Mockito.times(1)).clear();
        }
    }
}
