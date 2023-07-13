package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
public class MissingAuthorization_toString_2393b88875_Test {

    @Mock
    private MissingAuthorization missingAuthorization;

    private boolean isNullSetup = false;

    @BeforeEach
    public void setup() {
        Mockito.reset(missingAuthorization);
        if (isNullSetup) {
            Mockito.when(missingAuthorization.getPermissionName()).thenReturn(null);
            Mockito.when(missingAuthorization.getResourceType()).thenReturn(null);
            Mockito.when(missingAuthorization.getResourceId()).thenReturn(null);
        } else {
            Mockito.when(missingAuthorization.getPermissionName()).thenReturn("read");
            Mockito.when(missingAuthorization.getResourceType()).thenReturn("file");
            Mockito.when(missingAuthorization.getResourceId()).thenReturn("123");
        }
    }

    @Test
    public void testToString_WithValidInput() {
        isNullSetup = false;
        setup();
        String result = missingAuthorization.toString();
        assertEquals("MissingAuthorization[permissionName=read, resourceType=file, resourceId=123]", result);
    }

    @Test
    public void testToString_WithNullInput() {
        isNullSetup = true;
        setup();
        String result = missingAuthorization.toString();
        assertEquals("MissingAuthorization[permissionName=null, resourceType=null, resourceId=null]", result);
    }
}
