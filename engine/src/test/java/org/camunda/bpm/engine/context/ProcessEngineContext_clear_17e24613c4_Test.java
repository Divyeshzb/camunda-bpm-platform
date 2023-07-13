package org.camunda.bpm.engine.context;

import org.camunda.bpm.engine.impl.context.ProcessEngineContextImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.concurrent.Callable;

@RunWith(MockitoJUnitRunner.class)
public class ProcessEngineContext_clear_17e24613c4_Test {

    @Mock
    private Callable<Void> callableMock;

    @Before
    public void setUp() throws Exception {
        Mockito.doNothing().when(callableMock).call();
    }

    @Test
    public void testClearMethodExecution() throws Exception {
        callableMock.call();
        Mockito.verify(callableMock, Mockito.times(1)).call();
    }

    @Test(expected = Exception.class)
    public void testClearMethodExecutionFailure() throws Exception {
        Mockito.doThrow(new Exception()).when(callableMock).call();
        callableMock.call();
    }
}
