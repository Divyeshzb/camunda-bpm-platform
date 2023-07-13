package org.camunda.bpm.engine.exception.cmmn;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CaseDefinitionNotFoundException_CaseDefinitionNotFoundException_54652d8f32_Test {

    @Test
    public void testConstructorWithValidCause() {
        Throwable cause = new Throwable("Valid cause");
        Exception exception = new Exception();
        exception.initCause(cause);

        assertTrue(exception.getCause().equals(cause));
    }

    @Test
    public void testConstructorWithNullCause() {
        Throwable cause = null;

        assertThrows(NullPointerException.class, () -> {
            Exception exception = new Exception();
            exception.initCause(cause);
        });
    }
}
