package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class UserOperationLogCategoryPermissions_getValue_914b8c6310_Test {

    private UserOperationLogCategoryPermissions userOperationLogCategoryPermissions;

    @BeforeEach
    public void setUp() {
        userOperationLogCategoryPermissions = new UserOperationLogCategoryPermissions();
    }

    @Test
    public void testGetValue_WhenIdIsPositive() {
        // Assumption: setId and getValue methods exist in UserOperationLogCategoryPermissions class
        userOperationLogCategoryPermissions.setId(5);
        int expected = 5;
        int actual = userOperationLogCategoryPermissions.getValue();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetValue_WhenIdIsZero() {
        userOperationLogCategoryPermissions.setId(0);
        int expected = 0;
        int actual = userOperationLogCategoryPermissions.getValue();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetValue_WhenIdIsNegative() {
        userOperationLogCategoryPermissions.setId(-3);
        int expected = -3;
        int actual = userOperationLogCategoryPermissions.getValue();
        assertEquals(expected, actual);
    }
}
