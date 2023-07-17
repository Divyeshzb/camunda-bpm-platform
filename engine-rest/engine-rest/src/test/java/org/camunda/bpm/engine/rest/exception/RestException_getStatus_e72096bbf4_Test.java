package org.camunda.bpm.engine.rest.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import javax.ws.rs.core.Response.Status;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestException_getStatus_e72096bbf4_Test {

    @InjectMocks
    RestException restException;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        restException = new RestException(Status.OK);
    }

    @Test
    public void testGetStatusSuccess() {
        Status result = restException.getStatus();
        assertEquals(Status.OK, result);
    }

    @Test
    public void testGetStatusFailure() {
        restException = new RestException(Status.INTERNAL_SERVER_ERROR);
        Status result = restException.getStatus();
        assertEquals(Status.INTERNAL_SERVER_ERROR, result);
    }
}
