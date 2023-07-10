package org.camunda.bpm;

import org.camunda.bpm.container.RuntimeContainerDelegate;
import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngines;
import org.camunda.bpm.engine.impl.test.TestHelper;
import org.camunda.bpm.engine.ProcessApplicationService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class BpmPlatform_getProcessApplicationService_055cc31491_Test {

    @Mock
    private RuntimeContainerDelegate delegate;

    @Mock
    private ProcessApplicationService processApplicationService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @After
    public void tearDown() {
        ProcessEngines.destroy();
    }

    @Test
    public void testGetProcessApplicationService_success() {
        when(delegate.getProcessApplicationService()).thenReturn(processApplicationService);

        ProcessApplicationService expected = delegate.getProcessApplicationService();
        ProcessApplicationService actual = BpmPlatform.getProcessApplicationService();

        assertEquals(expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void testGetProcessApplicationService_failure() {
        when(delegate.getProcessApplicationService()).thenThrow(new RuntimeException());

        BpmPlatform.getProcessApplicationService();
    }
}
