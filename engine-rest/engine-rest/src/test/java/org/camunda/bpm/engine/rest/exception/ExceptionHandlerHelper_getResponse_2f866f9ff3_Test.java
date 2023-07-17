package org.camunda.bpm.engine.rest.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.ws.rs.core.Response;
import org.camunda.bpm.engine.AuthorizationException;
import org.camunda.bpm.engine.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExceptionHandlerHelper_getResponse_2f866f9ff3_Test {

    @InjectMocks
    private ExceptionHandlerHelper exceptionHandlerHelper;

    @Mock
    private Logger LOGGER;
    
    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetResponse_withAuthorizationException() {
        AuthorizationException exception = new AuthorizationException("Test Exception");
        LOGGER.log(Level.SEVERE, exception.getMessage(), exception);

        Response response = exceptionHandlerHelper.getResponse(exception);

        assertEquals(Response.Status.FORBIDDEN.getStatusCode(), response.getStatus());
    }

    @Test
    public void testGetResponse_withParseException() {
        ParseException exception = new ParseException("Test Exception");
        LOGGER.log(Level.SEVERE, exception.getMessage(), exception);

        Response response = exceptionHandlerHelper.getResponse(exception);

        assertEquals(Response.Status.BAD_REQUEST.getStatusCode(), response.getStatus());
    }
}
