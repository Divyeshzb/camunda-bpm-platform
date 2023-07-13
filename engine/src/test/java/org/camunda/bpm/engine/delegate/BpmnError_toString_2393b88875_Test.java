package org.camunda.bpm.engine.delegate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class BpmnError_toString_2393b88875_Test {

    @InjectMocks
    BpmnError bpmnError;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testToString_WithErrorCode() {
        String errorCode = "123";
        when(bpmnError.getErrorCode()).thenReturn(errorCode);

        String result = bpmnError.toString();

        assertEquals("org.camunda.bpm.engine.delegate.BpmnError: " + errorCode, result);
    }

    @Test
    public void testToString_WithoutErrorCode() {
        when(bpmnError.getErrorCode()).thenReturn(null);

        String result = bpmnError.toString();

        assertEquals("org.camunda.bpm.engine.delegate.BpmnError: null", result);
    }
}
