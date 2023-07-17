package org.camunda.bpm.engine.rest.exception;

import javax.ws.rs.core.Response.Status;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RestException_RestException_91c6795c63_Test {

    private RestException restException;
    private Exception cause;

    @BeforeEach
    public void setUp() {
        cause = new Exception("Test Exception");
        restException = new RestException();
    }

    @Test
    public void testRestExceptionWithValidStatus() {
        restException.setStatus(Status.OK);
        restException.setCause(cause);
        assertEquals(Status.OK, restException.getStatus());
        assertEquals(cause, restException.getCause());
    }

    @Test
    public void testRestExceptionWithNullStatus() {
        restException.setStatus(null);
        restException.setCause(cause);
        assertNull(restException.getStatus());
        assertEquals(cause, restException.getCause());
    }

    @Test
    public void testRestExceptionWithNullCause() {
        restException.setStatus(Status.OK);
        restException.setCause(null);
        assertEquals(Status.OK, restException.getStatus());
        assertNull(restException.getCause());
    }

    @Test
    public void testRestExceptionWithNullStatusAndCause() {
        restException.setStatus(null);
        restException.setCause(null);
        assertNull(restException.getStatus());
        assertNull(restException.getCause());
    }
}
