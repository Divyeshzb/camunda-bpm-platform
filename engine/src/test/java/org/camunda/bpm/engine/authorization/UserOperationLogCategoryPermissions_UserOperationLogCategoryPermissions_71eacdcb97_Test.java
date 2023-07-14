package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserOperationLogCategoryPermissions_UserOperationLogCategoryPermissions_71eacdcb97_Test {
    private UserOperationLogCategoryPermissions userOperationLogCategoryPermissions;

    @BeforeEach
    public void setup() {
        userOperationLogCategoryPermissions = Mockito.mock(UserOperationLogCategoryPermissions.class);
    }

    @Test
    public void testUserOperationLogCategoryPermissions_Name() {
        String name = "TestName";

        Mockito.when(userOperationLogCategoryPermissions.getName()).thenReturn(name);
        assertEquals(name, userOperationLogCategoryPermissions.getName(), "Expected and actual names should match");
    }

    @Test
    public void testUserOperationLogCategoryPermissions_Id() {
        int id = 123;

        Mockito.when(userOperationLogCategoryPermissions.getId()).thenReturn(id);
        assertEquals(id, userOperationLogCategoryPermissions.getId(), "Expected and actual IDs should match");
    }
}
