package org.camunda.bpm.engine.rest.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import javax.ws.rs.core.Response.Status;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RestException_RestException_81226e2377_Test {

    private RestException restException;
    private Status status;
    private Exception cause;
    private String message;

    @BeforeEach
    public void setUp() {
        status = Status.BAD_REQUEST;
        cause = new RuntimeException("Test exception");
        message = "Test message";
        restException = new RestException();
        restException.setStatus(status);
        restException.setCause(cause);
        restException.setMessage(message);
    }

    @Test
    public void testRestException() {
        assertEquals(message, restException.getMessage());
        assertEquals(cause, restException.getCause());
        assertEquals(status, restException.getStatus());
    }

    @Test
    public void testRestExceptionWithNullValues() {
        RestException restException = new RestException();
        assertTrue(restException.getMessage() == null);
        assertTrue(restException.getCause() == null);
        assertTrue(restException.getStatus() == null);
    }
}
