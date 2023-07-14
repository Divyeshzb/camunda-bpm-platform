package org.camunda.bpm.engine.context;

import org.camunda.bpm.engine.impl.context.ProcessEngineContextImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.verify;

import java.util.concurrent.Callable;

@ExtendWith(MockitoExtension.class)
public class ProcessEngineContext_requiresNew_22dd5a4978_Test {

    @InjectMocks
    private ProcessEngineContextImpl processEngineContext;

    @Mock
    private Callable<Void> callable;

    @BeforeEach
    public void setUp() {
        // No need to initialize processEngineContext as Mockito will automatically do it
    }

    @Test
    public void testRequiresNew_Success() throws Exception {
        processEngineContext.requiresNew(callable);
        verify(callable).call();
    }

    @Test
    public void testRequiresNew_Failure() throws Exception {
        processEngineContext.requiresNew(callable);
        verify(callable).call();
    }
}
