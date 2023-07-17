package org.camunda.bpm.engine.rest.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import javax.ws.rs.core.Response.Status;

public class RestException_RestException_90cbcea4b4_Test {

    private RestException restException;

    @BeforeEach
    public void setup() {
        // TODO: Initialize any necessary objects here
    }

    @Test
    public void testRestException_withValidStatusAndMessage() {
        String message = "Valid message";
        Status status = Status.OK;

        restException = new RestException(status, message);

        assertEquals(message, restException.getMessage());
        assertEquals(status, restException.getStatus());
    }

    @Test
    public void testRestException_withNullStatus() {
        String message = "Message with null status";

        restException = new RestException(null, message);

        assertNull(restException.getStatus());
        assertEquals(message, restException.getMessage());
    }

    @Test
    public void testRestException_withNullMessage() {
        Status status = Status.BAD_REQUEST;

        restException = new RestException(status, null);

        assertNull(restException.getMessage());
        assertEquals(status, restException.getStatus());
    }

    @Test
    public void testRestException_withNullStatusAndMessage() {
        restException = new RestException(null, null);

        assertNull(restException.getMessage());
        assertNull(restException.getStatus());
    }
}
