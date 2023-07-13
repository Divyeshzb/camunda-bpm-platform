package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class MissingAuthorization_MissingAuthorization_025969cb92_Test {

    @InjectMocks
    private MissingAuthorization missingAuthorization;

    @BeforeEach
    public void setUp() {
        missingAuthorization = new MissingAuthorization();
    }

    @Test
    public void testMissingAuthorizationPermissionName() {
        missingAuthorization.setPermissionName("read");
        assertEquals("read", missingAuthorization.getPermissionName());
    }

    @Test
    public void testMissingAuthorizationResourceType() {
        missingAuthorization.setResourceType("user");
        assertEquals("user", missingAuthorization.getResourceType());
    }

    @Test
    public void testMissingAuthorizationResourceId() {
        missingAuthorization.setResourceId("123");
        assertEquals("123", missingAuthorization.getResourceId());
    }
}
