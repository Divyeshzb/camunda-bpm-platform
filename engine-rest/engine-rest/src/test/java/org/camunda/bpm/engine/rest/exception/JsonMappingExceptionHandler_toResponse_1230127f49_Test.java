package org.camunda.bpm.engine.rest.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.fasterxml.jackson.databind.JsonMappingException;

public class JsonMappingExceptionHandler_toResponse_1230127f49_Test {

    @Mock
    private ExceptionHandlerHelper exceptionHandlerHelper;

    @InjectMocks
    private JsonMappingExceptionHandler jsonMappingExceptionHandler;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testToResponse_Success() {
        JsonMappingException exception = mock(JsonMappingException.class);
        Response expectedResponse = Response.status(Status.BAD_REQUEST).build();
        when(exceptionHandlerHelper.getResponse(new InvalidRequestException(Status.BAD_REQUEST, exception, "")))
            .thenReturn(expectedResponse);

        Response actualResponse = jsonMappingExceptionHandler.toResponse(exception);

        assertEquals(expectedResponse, actualResponse);
    }

    @Test
    public void testToResponse_Failure() {
        JsonMappingException exception = mock(JsonMappingException.class);
        Response expectedResponse = Response.status(Status.INTERNAL_SERVER_ERROR).build();
        when(exceptionHandlerHelper.getResponse(new InvalidRequestException(Status.BAD_REQUEST, exception, "")))
            .thenReturn(expectedResponse);

        Response actualResponse = jsonMappingExceptionHandler.toResponse(exception);

        assertEquals(expectedResponse, actualResponse);
    }
}
