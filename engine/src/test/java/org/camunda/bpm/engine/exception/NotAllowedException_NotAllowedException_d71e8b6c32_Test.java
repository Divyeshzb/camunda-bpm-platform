package org.camunda.bpm.engine.exception;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NotAllowedException_NotAllowedException_d71e8b6c32_Test {

    @Test
    public void testNotAllowedExceptionDefaultConstructor() {
        NotAllowedException exception = new NotAllowedException("Test exception message");
        assertNotNull(exception);
    }

    // TODO: Add more test cases as needed based on the functionality of NotAllowedException
}
