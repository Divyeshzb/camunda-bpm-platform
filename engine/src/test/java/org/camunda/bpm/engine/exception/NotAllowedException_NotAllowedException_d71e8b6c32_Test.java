package org.camunda.bpm.engine.exception;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class NotAllowedException_NotAllowedException_d71e8b6c32_Test {

    @Test
    public void testNotAllowedException_Message() {
        NotAllowedException exception = mock(NotAllowedException.class);
        when(exception.getMessage()).thenReturn(null);
        assertNull(exception.getMessage());
    }
}
