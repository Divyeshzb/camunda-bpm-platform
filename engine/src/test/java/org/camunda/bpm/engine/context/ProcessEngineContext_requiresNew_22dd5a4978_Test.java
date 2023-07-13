package org.camunda.bpm.engine.context;

import org.camunda.bpm.engine.impl.context.ProcessEngineContextImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

public class ProcessEngineContext_requiresNew_22dd5a4978_Test {

    @InjectMocks
    private ProcessEngineContextImpl processEngineContextImpl;

    @Mock
    private ProcessEngineContextImpl mockProcessEngineContextImpl;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testRequiresNew_Success() {
        Mockito.when(mockProcessEngineContextImpl.requiresNew()).thenReturn(true);
        boolean result = processEngineContextImpl.requiresNew();
        assertTrue(result);
    }

    @Test
    public void testRequiresNew_Failure() {
        Mockito.when(mockProcessEngineContextImpl.requiresNew()).thenReturn(false);
        boolean result = processEngineContextImpl.requiresNew();
        assertFalse(result);
    }
}
