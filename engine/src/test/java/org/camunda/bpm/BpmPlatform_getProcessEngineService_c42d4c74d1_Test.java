package org.camunda.bpm;

import org.camunda.bpm.container.RuntimeContainerDelegate;
import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngineException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class BpmPlatform_getProcessEngineService_c42d4c74d1_Test {

    @Mock
    private RuntimeContainerDelegate delegate;

    @Mock
    private ProcessEngine processEngine;

    @Before
    public void setUp() {
        RuntimeContainerDelegate.INSTANCE.set(delegate);
    }

    @Test
    public void testGetProcessEngineService_Success() {
        when(delegate.getProcessEngineService()).thenReturn(processEngine);

        ProcessEngine result = BpmPlatform.getProcessEngineService();

        assertNotNull(result);
    }

    @Test
    public void testGetProcessEngineService_Failure() {
        when(delegate.getProcessEngineService()).thenThrow(new ProcessEngineException("Process engine service not available"));

        assertThrows(ProcessEngineException.class, BpmPlatform::getProcessEngineService);
    }
}
