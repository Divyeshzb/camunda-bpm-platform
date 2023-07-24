// Test generated by RoostGPT for test camuda-engine-test using AI Type Open AI and AI Model gpt-4

package org.camunda.bpm.engine.rest.exception;

import javax.ws.rs.core.Response.Status;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RestException_RestException_81226e2377_Test {

    private RestException restException;
    private Status status;
    private Exception cause;
    private String message;

    @BeforeEach
    public void setUp() {
        status = Status.BAD_REQUEST;
        cause = new Exception("Test Exception");
        message = "Test Message";
        restException = new RestException(status, cause, message);
    }

    @Test
    public void testRestException() {
        assertEquals(message, restException.getMessage());
        assertEquals(cause, restException.getCause());
        assertEquals(status, restException.getStatus());
    }

    @Test
    public void testRestExceptionWithNullStatus() {
        status = null;
        RestException testRestException = new RestException(status, cause, message);
        assertNull(testRestException.getStatus());
        assertEquals(cause, testRestException.getCause());
        assertEquals(message, testRestException.getMessage());
    }

    @Test
    public void testRestExceptionWithNullException() {
        cause = null;
        RestException testRestException = new RestException(status, cause, message);
        assertNull(testRestException.getCause());
        assertEquals(status, testRestException.getStatus());
        assertEquals(message, testRestException.getMessage());
    }

    @Test
    public void testRestExceptionWithNullMessage() {
        message = null;
        RestException testRestException = new RestException(status, cause, message);
        assertNull(testRestException.getMessage());
        assertEquals(status, testRestException.getStatus());
        assertEquals(cause, testRestException.getCause());
    }

    @Test
    public void testRestExceptionWithAllNullParameters() {
        status = null;
        cause = null;
        message = null;
        RestException testRestException = new RestException(status, cause, message);
        assertNull(testRestException.getStatus());
        assertNull(testRestException.getCause());
        assertNull(testRestException.getMessage());
    }
}
