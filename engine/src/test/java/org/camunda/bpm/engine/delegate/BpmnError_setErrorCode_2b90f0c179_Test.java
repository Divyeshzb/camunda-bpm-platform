package org.camunda.bpm.engine.delegate;

import org.camunda.bpm.engine.ProcessEngineException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BpmnError_setErrorCode_2b90f0c179_Test {

    private Error error;

    @BeforeEach
    public void setup() {
        error = new Error();
    }

    @Test
    public void testSetErrorCode_Success() {
        String errorCode = "ERR_123";
        error.setErrorCode(errorCode);
        assertEquals(errorCode, error.getErrorCode());
    }

    @Test
    public void testSetErrorCode_Failure() {
        String errorCode = "";
        Exception exception = assertThrows(ProcessEngineException.class, () -> {
            error.setErrorCode(errorCode);
        });

        String expectedMessage = "Error Code cannot be empty";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testSetErrorCode_Null() {
        String errorCode = null;
        Exception exception = assertThrows(ProcessEngineException.class, () -> {
            error.setErrorCode(errorCode);
        });

        String expectedMessage = "Error Code cannot be null";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    class Error {
        private String errorCode;

        public void setErrorCode(String errorCode) {
            if (errorCode == null || errorCode.isEmpty()) {
                throw new ProcessEngineException("Error Code cannot be null or empty");
            }
            this.errorCode = errorCode;
        }

        public String getErrorCode() {
            return errorCode;
        }
    }
}
