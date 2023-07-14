package org.camunda.bpm.engine.delegate;

import org.camunda.bpm.engine.ProcessEngineException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class BpmnError_BpmnError_37622cca94_Test {

    private BpmnError bpmnError;

    @BeforeEach
    public void init() {
        bpmnError = new BpmnError("123", "Test Error", new Throwable("Cause"));
    }

    @Test
    public void testBpmnError_Success() {
        String errorCode = "123";
        String message = "Test Error";
        Throwable cause = new Throwable("Cause");

        assertNotNull(bpmnError);
        assertEquals(errorCode, bpmnError.getErrorCode());
        assertEquals(message, bpmnError.getMessage());
        assertEquals(cause, bpmnError.getCause());
    }

    @Test
    public void testBpmnError_NullErrorCode() {
        bpmnError = new BpmnError(null, "Test Error", new Throwable("Cause"));

        assertThrows(ProcessEngineException.class, () -> bpmnError.getErrorCode());
    }

    @Test
    public void testBpmnError_NullMessage() {
        bpmnError = new BpmnError("123", null, new Throwable("Cause"));

        assertThrows(ProcessEngineException.class, () -> bpmnError.getMessage());
    }

    @Test
    public void testBpmnError_NullCause() {
        bpmnError = new BpmnError("123", "Test Error", null);

        assertThrows(ProcessEngineException.class, () -> bpmnError.getCause());
    }
}
