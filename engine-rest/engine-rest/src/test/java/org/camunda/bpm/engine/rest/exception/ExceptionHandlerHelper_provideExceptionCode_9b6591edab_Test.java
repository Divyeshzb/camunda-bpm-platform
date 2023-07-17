package org.camunda.bpm.engine.rest.exception;

import org.camunda.bpm.engine.ProcessEngineException;
import org.camunda.bpm.engine.rest.dto.ExceptionDto;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.ws.rs.WebApplicationException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class ExceptionHandlerHelper_provideExceptionCode_9b6591edab_Test {

    @Mock
    private ProcessEngineException processEngineException;

    @Mock
    private WebApplicationException restException;

    @Mock
    private ExceptionDto exceptionDto;

    private ExceptionHandlerHelper exceptionHandlerHelper;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        exceptionHandlerHelper = new ExceptionHandlerHelper();
    }

    @Test
    public void testProvideExceptionCode_ProcessEngineException() {
        when(processEngineException.getCode()).thenReturn(100);
        exceptionHandlerHelper.provideExceptionCode(processEngineException, exceptionDto);
        assertEquals(Integer.valueOf(100), exceptionDto.getCode());
    }

    @Test
    public void testProvideExceptionCode_RestException() {
        when(restException.getCause()).thenReturn(processEngineException);
        when(processEngineException.getCode()).thenReturn(200);
        exceptionHandlerHelper.provideExceptionCode(restException, exceptionDto);
        assertEquals(Integer.valueOf(200), exceptionDto.getCode());
    }

    @Test
    public void testProvideExceptionCode_NoExceptionCode() {
        exceptionHandlerHelper.provideExceptionCode(new Exception(), exceptionDto);
        assertEquals(null, exceptionDto.getCode());
    }
}
