package org.camunda.bpm.engine.rest.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class ExceptionHandler_toResponse_0dfff38235_Test {

    @InjectMocks
    private ExceptionMapper exceptionMapper;

    @Mock
    private ExceptionHandlerHelper exceptionHandlerHelper;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testToResponse_Success() {
        Throwable throwable = new Throwable("Test exception");
        Response mockResponse = Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Test exception").build();

        when(exceptionHandlerHelper.getResponse(throwable)).thenReturn(mockResponse);

        Response response = exceptionMapper.toResponse(throwable);
        assertEquals(mockResponse.getStatus(), response.getStatus());
        assertEquals(mockResponse.getEntity(), response.getEntity());
    }

    @Test
    public void testToResponse_NullThrowable() {
        Throwable throwable = null;
        Response mockResponse = Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Null exception").build();

        when(exceptionHandlerHelper.getResponse(throwable)).thenReturn(mockResponse);

        Response response = exceptionMapper.toResponse(throwable);
        assertEquals(mockResponse.getStatus(), response.getStatus());
        assertEquals(mockResponse.getEntity(), response.getEntity());
    }
}
