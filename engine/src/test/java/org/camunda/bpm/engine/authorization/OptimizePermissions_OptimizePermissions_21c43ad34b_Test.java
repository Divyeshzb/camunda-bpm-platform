package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class OptimizePermissions_OptimizePermissions_21c43ad34b_Test {

    private OptimizePermissions optimizePermissions;

    @MockBean
    private ExternalService externalService;

    @BeforeEach
    public void setUp() {
        optimizePermissions = new OptimizePermissions();
        optimizePermissions.setName("testName");
        optimizePermissions.setId(1);
    }

    @Test
    public void testOptimizePermissionsName() {
        assertEquals("testName", optimizePermissions.getName(), "The name should be testName");
    }

    @Test
    public void testOptimizePermissionsId() {
        assertEquals(1, optimizePermissions.getId(), "The id should be 1");
    }
}
