package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserOperationLogCategoryPermissions_getName_4ad76af4d7_Test {

    @Test
    public void testGetName_Success() {
        String expectedName = "READ";
        
        String actualName = UserOperationLogCategoryPermissions.READ.name();

        Assertions.assertEquals(expectedName, actualName);
    }
}
