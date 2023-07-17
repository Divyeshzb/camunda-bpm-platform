package org.camunda.bpm.engine.rest.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import javax.ws.rs.core.Response.Status;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class RestException_RestException_81226e2377_Test {

    @Mock
    private Exception mockedException;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testRestException_withValidInputs() {
        String message = "Test Message";
        Status status = Status.OK;

        RestException restException = new RestException(status, mockedException, message);

        assertEquals(message, restException.getMessage());
        assertEquals(mockedException, restException.getCause());
        assertEquals(status, restException.getStatus());
    }

    @Test
    public void testRestException_withNullInputs() {
        String message = null;
        Status status = null;

        RestException restException = new RestException(status, mockedException, message);

        assertEquals(message, restException.getMessage());
        assertEquals(mockedException, restException.getCause());
        assertEquals(status, restException.getStatus());
    }
}
