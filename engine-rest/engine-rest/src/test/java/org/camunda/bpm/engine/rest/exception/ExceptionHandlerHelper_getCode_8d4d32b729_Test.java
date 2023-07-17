package org.camunda.bpm.engine.rest.exception;

import org.camunda.bpm.engine.ProcessEngineException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

public class ExceptionHandlerHelper_getCode_8d4d32b729_Test {

    @Mock
    private ProcessEngineException processEngineExceptionMock;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetCode_Success() {
        when(processEngineExceptionMock.getCode()).thenReturn(123);

        int result = getCode(processEngineExceptionMock);

        assertEquals(123, result);
    }

    @Test
    public void testGetCode_NullPointerException() {
        Throwable throwable = new NullPointerException();

        assertThrows(ClassCastException.class, () -> {
            getCode(throwable);
        });
    }

    protected Integer getCode(Throwable throwable) {
        ProcessEngineException pex = (ProcessEngineException) throwable;
        return pex.getCode();
    }
}
