package org.camunda.bpm.engine.rest.exception;

import javax.ws.rs.core.Response.Status;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestException_getStatus_e72096bbf4_Test {

    @InjectMocks
    private RestException restException;

    @BeforeEach
    public void setUp() {
        restException = new RestException();
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetStatus_success() {
        Status expectedStatus = Status.OK;
        restException.setStatus(expectedStatus);
        Status actualStatus = restException.getStatus();
        assertEquals(expectedStatus, actualStatus, "Status should be OK");
    }

    @Test
    public void testGetStatus_failure() {
        Status expectedStatus = Status.BAD_REQUEST;
        restException.setStatus(expectedStatus);
        Status actualStatus = restException.getStatus();
        assertEquals(expectedStatus, actualStatus, "Status should be BAD_REQUEST");
    }
}
