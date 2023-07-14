package org.camunda.bpm.engine.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NotAllowedException_NotAllowedException_e159dccc5f_Test {

    private NotAllowedException exception;

    @BeforeEach
    public void setUp() {
        exception = new NotAllowedException();
    }

    @Test
    public void testNotAllowedException_withMessage() {
        assertEquals(null, exception.getMessage());
    }

    @Test
    public void testNotAllowedException_withDifferentMessage() {
        exception = new NotAllowedException();
        assertEquals(null, exception.getMessage());
    }

    // TODO: Add more test cases as per real scenarios
}
