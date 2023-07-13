package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class Permissions_forName_183d8c5ef5_Test {

    private Permission permission;

    @BeforeEach
    public void setup() {
        permission = Mockito.mock(Permission.class);
    }

    @Test
    public void testForName_ValidName() {
        String validName = "VALID_PERMISSION_NAME";
        Permission expectedPermission = Permission.valueOf(validName);
        Mockito.when(permission.forName(validName)).thenReturn(expectedPermission);
        Permission actualPermission = permission.forName(validName);
        assertEquals(expectedPermission, actualPermission, "Expected permission does not match actual permission");
    }

    @Test
    public void testForName_InvalidName() {
        String invalidName = "INVALID_PERMISSION_NAME";
        Mockito.when(permission.forName(invalidName)).thenThrow(IllegalArgumentException.class);
        assertThrows(IllegalArgumentException.class, () -> permission.forName(invalidName), "Expected IllegalArgumentException to be thrown for invalid name");
    }
}
