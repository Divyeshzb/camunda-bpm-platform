package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.mockito.Mockito;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TaskPermissions_getValue_914b8c6310_Test {

    @MockBean
    TaskPermissions taskPermissions;

    @Test
    public void testGetValue() {
        int expectedValue = 5;
        Mockito.when(taskPermissions.getValue()).thenReturn(expectedValue);
        int actualValue = taskPermissions.getValue();
        assertEquals(expectedValue, actualValue, "Expected value doesn't match the actual value");
    }

    @Test
    public void testGetValueWithDifferentValue() {
        int expectedValue = 10;
        Mockito.when(taskPermissions.getValue()).thenReturn(expectedValue);
        int actualValue = taskPermissions.getValue();
        assertEquals(expectedValue, actualValue, "Expected value doesn't match the actual value");
    }

    @Test
    public void testGetValueWithNegativeValue() {
        int expectedValue = -5;
        Mockito.when(taskPermissions.getValue()).thenReturn(expectedValue);
        int actualValue = taskPermissions.getValue();
        assertEquals(expectedValue, actualValue, "Expected value doesn't match the actual value");
    }
}
