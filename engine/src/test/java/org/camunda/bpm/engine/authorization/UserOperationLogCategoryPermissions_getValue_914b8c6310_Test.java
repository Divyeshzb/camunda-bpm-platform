package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class UserOperationLogCategoryPermissions_getValue_914b8c6310_Test {

    @Mock
    private UserOperationLogCategoryPermissions userOperationLogCategoryPermissions;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetValueWithPositiveId() {
        Integer id = 5;
        when(userOperationLogCategoryPermissions.getValue()).thenReturn(id);
        assertEquals(id, userOperationLogCategoryPermissions.getValue(), "Expected value to be 5");
    }

    @Test
    public void testGetValueWithNegativeId() {
        Integer id = -5;
        when(userOperationLogCategoryPermissions.getValue()).thenReturn(id);
        assertEquals(id, userOperationLogCategoryPermissions.getValue(), "Expected value to be -5");
    }

}
