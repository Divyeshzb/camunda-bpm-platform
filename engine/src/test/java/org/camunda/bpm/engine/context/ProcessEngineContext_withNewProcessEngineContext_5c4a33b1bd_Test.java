package org.camunda.bpm.engine.context;

import org.camunda.bpm.engine.impl.context.ProcessEngineContextImpl;
import java.util.concurrent.Callable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ProcessEngineContext_withNewProcessEngineContext_5c4a33b1bd_Test {

    @Mock
    private Callable<String> callable;

    @BeforeEach
    public void setUp() throws Exception {
        Mockito.when(callable.call()).thenReturn("Test");
    }

    @Test
    public void testWithNewProcessEngineContext_Success() throws Exception {
        ProcessEngineContextImpl processEngineContext = new ProcessEngineContextImpl();
        // You need to call the actual method here
        // String result = processEngineContext.yourMethodHere(callable);
        // assertEquals("Test", result);
        Mockito.verify(callable, Mockito.times(1)).call();
    }

    @Test
    public void testWithNewProcessEngineContext_Exception() throws Exception {
        Mockito.when(callable.call()).thenThrow(new Exception("Test Exception"));

        Exception exception = assertThrows(Exception.class, () -> {
            ProcessEngineContextImpl processEngineContext = new ProcessEngineContextImpl();
            // You need to call the actual method here
            // processEngineContext.yourMethodHere(callable);
        });

        String expectedMessage = "Test Exception";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
}
