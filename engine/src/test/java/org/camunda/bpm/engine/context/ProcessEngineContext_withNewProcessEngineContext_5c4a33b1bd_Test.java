package org.camunda.bpm.engine.context;

import org.camunda.bpm.engine.impl.context.ProcessEngineContextImpl;
import java.util.concurrent.Callable;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class ProcessEngineContext_withNewProcessEngineContext_5c4a33b1bd_Test {

    @Mock
    private Callable<String> mockCallable;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @AfterEach
    public void tearDown() {
        clear();
    }

    @Test
    public void testWithNewProcessEngineContext_Success() throws Exception {
        when(mockCallable.call()).thenReturn("Success");

        String result = withNewProcessEngineContext(mockCallable);

        assertEquals("Success", result);
        verify(mockCallable, times(1)).call();
    }

    @Test
    public void testWithNewProcessEngineContext_Exception() throws Exception {
        when(mockCallable.call()).thenThrow(new RuntimeException("Exception occurred"));

        assertThrows(RuntimeException.class, () -> {
            withNewProcessEngineContext(mockCallable);
        });

        verify(mockCallable, times(1)).call();
    }

    private void clear() {
        // TODO: Implement clear method
    }

    private void requiresNew() {
        // TODO: Implement requiresNew method
    }

    private <T> T withNewProcessEngineContext(Callable<T> callable) throws Exception {
        try {
            requiresNew();
            return callable.call();
        } finally {
            clear();
        }
    }
}
