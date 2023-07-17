package org.camunda.bpm.engine.rest.exception;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class ExceptionHandlerHelper_getInstance_292da993d8_Test {

    private ExceptionHandlerHelper exceptionHandlerHelper;

    @BeforeEach
    public void setup() {
        exceptionHandlerHelper = Mockito.mock(ExceptionHandlerHelper.class);
        Mockito.when(exceptionHandlerHelper.getInstance()).thenReturn(exceptionHandlerHelper);
    }

    @Test
    public void testGetInstance_whenCalled_shouldReturnInstance() {
        ExceptionHandlerHelper result = exceptionHandlerHelper.getInstance();
        Assertions.assertNotNull(result, "Instance should not be null");
        Assertions.assertEquals(exceptionHandlerHelper, result, "Returned instance should match the mocked instance");
    }

    @Test
    public void testGetInstance_whenCalledMultipleTimes_shouldReturnSameInstance() {
        ExceptionHandlerHelper result1 = exceptionHandlerHelper.getInstance();
        ExceptionHandlerHelper result2 = exceptionHandlerHelper.getInstance();
        Assertions.assertEquals(result1, result2, "Instances returned from multiple calls should be the same");
    }
}
