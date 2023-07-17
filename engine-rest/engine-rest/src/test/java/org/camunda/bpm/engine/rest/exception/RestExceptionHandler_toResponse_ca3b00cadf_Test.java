package org.camunda.bpm.engine.rest.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class RestExceptionHandler_toResponse_ca3b00cadf_Test {

    @InjectMocks
    RestExceptionHandler restExceptionHandler;

    @Mock
    ExceptionHandlerHelper exceptionHandlerHelper;

    @Before
    public void setUp() {
        restExceptionHandler = new RestExceptionHandler();
        exceptionHandlerHelper = new ExceptionHandlerHelper();
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testToResponse_success() {
        RestException exception = new RestException("Test exception");
        Response mockResponse = mock(Response.class);
        when(exceptionHandlerHelper.getResponse(exception)).thenReturn(mockResponse);

        Response response = restExceptionHandler.toResponse(exception);

        assertNotNull(response);
        assertEquals(mockResponse, response);
    }

    @Test(expected = RestException.class)
    public void testToResponse_exception() {
        RestException exception = new RestException("Test exception");
        when(exceptionHandlerHelper.getResponse(exception)).thenThrow(RestException.class);

        restExceptionHandler.toResponse(exception);
    }
}
