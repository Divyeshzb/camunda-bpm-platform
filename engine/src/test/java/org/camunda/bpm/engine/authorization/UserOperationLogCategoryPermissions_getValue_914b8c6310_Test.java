package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserOperationLogCategoryPermissions_getValue_914b8c6310_Test {

    @Test
    public void testGetValue_PositiveNumber() {
        UserOperationLogCategoryPermissions userOperationLog = new UserOperationLogCategoryPermissions();
        userOperationLog.setValue(5);
        int result = userOperationLog.getValue();
        assertEquals(5, result, "Expected value to be 5");
    }

    @Test
    public void testGetValue_Zero() {
        UserOperationLogCategoryPermissions userOperationLog = new UserOperationLogCategoryPermissions();
        userOperationLog.setValue(0);
        int result = userOperationLog.getValue();
        assertEquals(0, result, "Expected value to be 0");
    }

    @Test
    public void testGetValue_NegativeNumber() {
        UserOperationLogCategoryPermissions userOperationLog = new UserOperationLogCategoryPermissions();
        userOperationLog.setValue(-10);
        int result = userOperationLog.getValue();
        assertEquals(-10, result, "Expected value to be -10");
    }
}
