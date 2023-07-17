package org.camunda.bpm.engine.rest.exception;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import org.camunda.bpm.engine.ProcessEngineException;
import org.camunda.bpm.engine.rest.exception.RestException;
import org.junit.Before;
import org.junit.Test;

public class ExceptionHandlerHelper_getStatus_ac2dee8e7d_Test {

    private ExceptionHandlerHelper exceptionHandlerHelper;

    @Before
    public void setUp() {
        exceptionHandlerHelper = new ExceptionHandlerHelper();
    }

    @Test
    public void testGetStatus_ProcessEngineException() {
        ProcessEngineException exception = mock(ProcessEngineException.class);
        Response.Status expectedStatus = Response.Status.INTERNAL_SERVER_ERROR; 
        assertEquals(expectedStatus, exceptionHandlerHelper.getStatus(exception));
    }

    @Test
    public void testGetStatus_RestException() {
        RestException exception = mock(RestException.class);
        Response.Status expectedStatus = Response.Status.INTERNAL_SERVER_ERROR;
        assertEquals(expectedStatus, exceptionHandlerHelper.getStatus(exception));
    }

    @Test
    public void testGetStatus_WebApplicationException() {
        WebApplicationException exception = mock(WebApplicationException.class);
        Response response = mock(Response.class);
        when(exception.getResponse()).thenReturn(response);
        when(response.getStatus()).thenReturn(400);
        Response.Status expectedStatus = Response.Status.BAD_REQUEST;
        assertEquals(expectedStatus, exceptionHandlerHelper.getStatus(exception));
    }
}
