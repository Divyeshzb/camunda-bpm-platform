package org.camunda.bpm.engine.rest.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import org.camunda.bpm.engine.AuthorizationException;
import org.camunda.bpm.engine.ProcessEngineException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@Provider
public class ProcessEngineExceptionHandler_toResponse_31f68c06d3_Test {

    @InjectMocks
    private ProcessEngineExceptionHandler exceptionHandler;

    @Mock
    private ExceptionHandlerHelper exceptionHandlerHelper;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testToResponse_Success() {
        ProcessEngineException exception = new ProcessEngineException("Test Exception");
        Response expectedResponse = Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Test Exception").build();

        when(exceptionHandlerHelper.getInstance().getResponse(exception)).thenReturn(expectedResponse);

        Response actualResponse = exceptionHandler.toResponse(exception);

        assertEquals(expectedResponse.getStatus(), actualResponse.getStatus());
        assertEquals(expectedResponse.getEntity(), actualResponse.getEntity());
    }

    @Test
    public void testToResponse_NullException() {
        ProcessEngineException exception = null;
        Response expectedResponse = Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Null Exception").build();

        when(exceptionHandlerHelper.getInstance().getResponse(exception)).thenReturn(expectedResponse);

        Response actualResponse = exceptionHandler.toResponse(exception);

        assertEquals(expectedResponse.getStatus(), actualResponse.getStatus());
        assertEquals(expectedResponse.getEntity(), actualResponse.getEntity());
    }
}
