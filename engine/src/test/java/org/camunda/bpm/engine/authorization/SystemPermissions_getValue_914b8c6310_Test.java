package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SystemPermissions_getValue_914b8c6310_Test {

    private SomeClass someClass;

    @Mock
    private ExternalService externalService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        someClass = new SomeClass();
    }

    @Test
    public void testGetValueSuccess() {
        int expectedValue = 1;
        someClass.setId(expectedValue);
        int actualValue = someClass.getValue();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testGetValueFailure() {
        int unexpectedValue = 2;
        someClass.setId(unexpectedValue);
        int actualValue = someClass.getValue();
        assertEquals(1, actualValue);
    }
}
