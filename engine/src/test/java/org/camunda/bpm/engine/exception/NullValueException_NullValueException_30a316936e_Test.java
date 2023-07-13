package org.camunda.bpm.engine.exception;

import org.camunda.bpm.engine.ProcessEngineException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NullValueException extends ProcessEngineException {
    public NullValueException() {
        super("This is a null value exception");
    }
}

public class NullValueException_NullValueException_30a316936e_Test {

    @Test
    public void testNullValueException() {
        try {
            throw new NullValueException();
        } catch (NullValueException e) {
            Assertions.assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testNullValueExceptionFailure() {
        try {
            throw new NullValueException();
        } catch (Exception e) {
            Assertions.assertTrue(e instanceof NullValueException);
        }
    }
}
