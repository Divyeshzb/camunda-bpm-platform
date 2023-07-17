package org.camunda.bpm.engine.rest.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class RestException_RestException_51cf441c95_Test {

    private RestException restException;
    private String testMessage = "Test exception message";

    @BeforeEach
    public void setUp() {
        restException = new RestException(testMessage);
    }

    @Test
    public void testRestExceptionMessage() {
        assertEquals(testMessage, restException.getMessage());
    }

    @Test
    public void testRestExceptionEmptyMessage() {
        RestException emptyMessageException = new RestException("");
        assertEquals("", emptyMessageException.getMessage());
    }
}
