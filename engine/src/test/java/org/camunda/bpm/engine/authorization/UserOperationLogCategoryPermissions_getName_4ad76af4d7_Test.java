package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class UserOperationLogCategoryPermissionsTest {

    private UserOperationLogCategoryPermissions userOperationLogCategoryPermissions;

    @BeforeEach
    public void setUp() {
        userOperationLogCategoryPermissions = new UserOperationLogCategoryPermissions();
    }

    @Test
    public void testGetName() {
        String name = userOperationLogCategoryPermissions.getName();
        assertEquals("TestName", name); // assuming "TestName" is the default name
    }

    @Test
    public void testGetName_Null() {
        String name = userOperationLogCategoryPermissions.getName();
        assertEquals(null, name); // assuming null is the default name
    }
}
