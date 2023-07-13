package org.camunda.bpm.engine.exception.cmmn;

import org.camunda.bpm.model.cmmn.CmmnModelInstance;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class CmmnModelInstanceNotFoundException_CmmnModelInstanceNotFoundException_a503bcfeb7_Test {

    @Mock
    CmmnModelInstance cmmnModelInstance;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCmmnModelInstanceNotFoundException_WithValidMessage() {
        String expectedMessage = "CMMN Model Instance not found";
        try {
            throw new CmmnModelInstanceNotFoundException(expectedMessage);
        } catch (CmmnModelInstanceNotFoundException e) {
            Assertions.assertEquals(expectedMessage, e.getMessage());
        }
    }

    @Test
    public void testCmmnModelInstanceNotFoundException_WithNullMessage() {
        String expectedMessage = null;
        try {
            throw new CmmnModelInstanceNotFoundException(expectedMessage);
        } catch (CmmnModelInstanceNotFoundException e) {
            Assertions.assertNull(e.getMessage());
        }
    }
}
