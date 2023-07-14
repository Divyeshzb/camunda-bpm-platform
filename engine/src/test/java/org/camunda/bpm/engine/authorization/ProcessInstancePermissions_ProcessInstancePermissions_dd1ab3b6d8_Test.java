package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ProcessInstancePermissions_ProcessInstancePermissions_dd1ab3b6d8_Test {

    @InjectMocks
    private ProcessInstancePermissions processInstancePermissions;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testProcessInstancePermissions_withValidInputs() {
        String name = "TestName";
        int id = 1;
        
        processInstancePermissions.setName(name);
        processInstancePermissions.setId(id);

        assertEquals(name, processInstancePermissions.getName());
        assertEquals(id, processInstancePermissions.getId());
    }

    @Test
    public void testProcessInstancePermissions_withEmptyName() {
        String name = "";
        int id = 2;
        
        processInstancePermissions.setName(name);
        processInstancePermissions.setId(id);

        assertEquals(name, processInstancePermissions.getName());
        assertEquals(id, processInstancePermissions.getId());
    }

    @Test
    public void testProcessInstancePermissions_withNegativeId() {
        String name = "TestName";
        int id = -1;
        
        processInstancePermissions.setName(name);
        processInstancePermissions.setId(id);

        assertEquals(name, processInstancePermissions.getName());
        assertEquals(id, processInstancePermissions.getId());
    }
}
