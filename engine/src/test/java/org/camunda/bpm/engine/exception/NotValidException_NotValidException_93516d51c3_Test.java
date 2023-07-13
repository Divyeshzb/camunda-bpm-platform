package org.camunda.bpm.engine.exception;

import org.camunda.bpm.engine.BadUserRequestException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NotValidException_NotValidException_93516d51c3_Test {

    @Test
    public void testNotValidException_Success() {
        NotValidException notValidException = assertThrows(NotValidException.class, () -> {
            throw new NotValidException();
        });
        assertNotNull(notValidException);
    }

    @Test
    public void testNotValidException_Failure() {
        NotValidException notValidException = assertThrows(NotValidException.class, () -> {
            throw new NotValidException();
        });
        assertTrue(notValidException instanceof NotValidException);
    }
}
