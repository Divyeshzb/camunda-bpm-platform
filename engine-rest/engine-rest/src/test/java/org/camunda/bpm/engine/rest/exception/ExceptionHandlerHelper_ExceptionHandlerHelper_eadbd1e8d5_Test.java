package org.camunda.bpm.engine.rest.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ExceptionHandlerHelper_ExceptionHandlerHelper_eadbd1e8d5_Test {

    @Mock
    ExceptionHandlerHelper exceptionHandlerHelper;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testConstructor() {
        ExceptionHandlerHelper testInstance = new ExceptionHandlerHelper();
        assertNotNull(testInstance, "ExceptionHandlerHelper instance should not be null");
    }

    @Test
    public void testMockedConstructor() {
        assertNotNull(exceptionHandlerHelper, "Mocked ExceptionHandlerHelper instance should not be null");
    }
}
