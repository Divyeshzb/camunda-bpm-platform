package org.camunda.bpm.engine.rest.exception;

import javax.ws.rs.core.Response.Status;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InvalidRequestException_InvalidRequestException_f9e7f89f59_Test {

    private Status status;
    private String message;

    @BeforeEach
    public void setUp() {
        status = Status.BAD_REQUEST;
        message = "Invalid Request";
    }

    @Test
    public void testInvalidRequestException_success() {
        InvalidRequestException exception = new InvalidRequestException();
        exception.setStatus(status);
        exception.setMessage(message);
        assertEquals(status, exception.getStatus());
        assertEquals(message, exception.getMessage());
    }

    @Test
    public void testInvalidRequestException_failure() {
        InvalidRequestException exception = new InvalidRequestException();
        exception.setStatus(status);
        exception.setMessage(message);
        assertNotEquals(Status.OK, exception.getStatus());
        assertNotEquals("Valid Request", exception.getMessage());
    }
}
