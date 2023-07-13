package org.camunda.bpm.engine.context;

import org.camunda.bpm.engine.impl.context.ProcessEngineContextImpl;
import java.util.concurrent.Callable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProcessEngineContext_withNewProcessEngineContext_5c4a33b1bd_Test {

    @Test
    public void testWithNewProcessEngineContext_Success() throws Exception {
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "test";
            }
        };
        String result = ProcessEngineContextImpl.withNewProcessEngineContext(callable);
        assertEquals("test", result);
    }

    @Test
    public void testWithNewProcessEngineContext_Exception() throws Exception {
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                throw new Exception("Test Exception");
            }
        };
        Exception exception = assertThrows(Exception.class, () -> {
            ProcessEngineContextImpl.withNewProcessEngineContext(callable);
        });
        assertEquals("Test Exception", exception.getMessage());
    }

    @Test
    public void testWithNewProcessEngineContext_Null() throws Exception {
        Callable<String> callable = null;
        Exception exception = assertThrows(NullPointerException.class, () -> {
            ProcessEngineContextImpl.withNewProcessEngineContext(callable);
        });
        assertEquals("Callable must not be null", exception.getMessage());
    }
}
