package org.camunda.bpm.engine.rest.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import javax.ws.rs.core.Response;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class ExceptionHandlerHelper_getResponse_2f866f9ff3_Test {

    @InjectMocks
    private ExceptionHandlerHelper exceptionHandlerHelper;

    @Mock
    private Logger LOGGER;

    @Mock
    private Throwable throwable;

    @Mock
    private ExceptionDto exceptionDto;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetResponse_Success() {
        when(LOGGER.log(throwable)).thenReturn(null);
        when(exceptionHandlerHelper.getStatus(throwable)).thenReturn(Response.Status.OK);
        when(exceptionHandlerHelper.fromException(throwable)).thenReturn(exceptionDto);
        when(exceptionHandlerHelper.provideExceptionCode(throwable, exceptionDto)).thenReturn(null);

        Response response = exceptionHandlerHelper.getResponse(throwable);

        assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
        assertEquals(MediaType.APPLICATION_JSON_TYPE, response.getMediaType());
        assertEquals(exceptionDto, response.getEntity());
    }

    @Test
    public void testGetResponse_Failure() {
        when(LOGGER.log(throwable)).thenReturn(null);
        when(exceptionHandlerHelper.getStatus(throwable)).thenReturn(Response.Status.INTERNAL_SERVER_ERROR);
        when(exceptionHandlerHelper.fromException(throwable)).thenReturn(exceptionDto);
        when(exceptionHandlerHelper.provideExceptionCode(throwable, exceptionDto)).thenReturn(null);

        Response response = exceptionHandlerHelper.getResponse(throwable);

        assertEquals(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), response.getStatus());
        assertEquals(MediaType.APPLICATION_JSON_TYPE, response.getMediaType());
        assertEquals(exceptionDto, response.getEntity());
    }
}
