package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class UserOperationLogCategoryPermissions_UserOperationLogCategoryPermissions_71eacdcb97_Test {

    private UserOperationLogCategoryPermissions userOperationLogCategoryPermissions;

    @BeforeEach
    public void setup() {
        userOperationLogCategoryPermissions = Mockito.mock(UserOperationLogCategoryPermissions.class);
    }

    @Test
    public void testUserOperationLogCategoryPermissions_Success() {
        Mockito.when(userOperationLogCategoryPermissions.getName()).thenReturn("John");
        Mockito.when(userOperationLogCategoryPermissions.getId()).thenReturn(1);

        Assertions.assertEquals("John", userOperationLogCategoryPermissions.getName());
        Assertions.assertEquals(1, userOperationLogCategoryPermissions.getId());
    }

    @Test
    public void testUserOperationLogCategoryPermissions_Failure() {
        Mockito.when(userOperationLogCategoryPermissions.getName()).thenReturn(null);
        Mockito.when(userOperationLogCategoryPermissions.getId()).thenReturn(0);

        Assertions.assertNull(userOperationLogCategoryPermissions.getName());
        Assertions.assertEquals(0, userOperationLogCategoryPermissions.getId());
    }
}
