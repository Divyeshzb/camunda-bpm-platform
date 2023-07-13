package org.camunda.bpm.engine.authorization;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.when;

public class UserOperationLogCategoryPermissionsTest {

    @Mock
    private UserOperationLogCategoryPermissions userOperationLogCategoryPermissions;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetNameSuccess() {
        String expectedName = "John Doe";
        when(userOperationLogCategoryPermissions.getName()).thenReturn(expectedName);
        String actualName = userOperationLogCategoryPermissions.getName();
        Assert.assertEquals(expectedName, actualName);
    }
    
    @Test
    public void testGetNameFailure() {
        String unexpectedName = "Jane Doe";
        when(userOperationLogCategoryPermissions.getName()).thenReturn("John Doe");
        String actualName = userOperationLogCategoryPermissions.getName();
        Assert.assertNotEquals(unexpectedName, actualName);
    }
}
