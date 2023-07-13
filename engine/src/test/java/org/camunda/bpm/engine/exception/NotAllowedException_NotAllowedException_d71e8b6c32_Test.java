package org.camunda.bpm.engine.exception;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NotAllowedException_NotAllowedException_d71e8b6c32_Test {

    @Test
    public void testNotAllowedExceptionSuccess() {
        NotAllowedException exception = new NotAllowedException();
        assertEquals(null, exception.getMessage());
    }

    @Test
    public void testNotAllowedExceptionFailure() {
        Exception thrown = assertThrows(NotAllowedException.class, () -> { throw new NotAllowedException(); });
        assertEquals(null, thrown.getMessage());
    }
}
