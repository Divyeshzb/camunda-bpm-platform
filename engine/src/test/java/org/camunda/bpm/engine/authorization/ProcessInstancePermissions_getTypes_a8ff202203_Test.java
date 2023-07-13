package org.camunda.bpm.engine.authorization;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProcessInstancePermissions_getTypes_a8ff202203_Test {

    private ProcessInstancePermissions processInstancePermissions;

    @BeforeEach
    public void setup() {
        processInstancePermissions = new ProcessInstancePermissions();
    }

    @Test
    public void testGetTypes() {
        Resource[] actualResources = processInstancePermissions.getTypes();
        assertNotNull(actualResources);
    }
}
