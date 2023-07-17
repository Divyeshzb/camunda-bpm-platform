package org.camunda.bpm.engine.rest.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.ws.rs.core.Response;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class ExceptionHandlerHelper_getStatus_a95e607cbf_Test {

    @Mock
    private RestException restException;

    private ExceptionHandlerHelper exceptionHandlerHelper;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        exceptionHandlerHelper = new ExceptionHandlerHelper();
    }

    @Test
    public void testGetStatus_WhenRestExceptionStatusNotNull() {
        // Arrange
        when(restException.getStatus()).thenReturn(Response.Status.BAD_REQUEST);

        // Act
        Response.Status actualStatus = exceptionHandlerHelper.getStatus(restException);

        // Assert
        assertEquals(Response.Status.BAD_REQUEST, actualStatus);
    }

    @Test
    public void testGetStatus_WhenRestExceptionStatusNull() {
        // Arrange
        when(restException.getStatus()).thenReturn(null);

        // Act
        Response.Status actualStatus = exceptionHandlerHelper.getStatus(restException);

        // Assert
        assertEquals(Response.Status.INTERNAL_SERVER_ERROR, actualStatus);
    }
}
