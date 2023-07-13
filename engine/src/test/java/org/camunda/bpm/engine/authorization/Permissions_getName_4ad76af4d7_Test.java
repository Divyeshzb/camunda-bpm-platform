package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Permissions_getName_4ad76af4d7_Test {

    private Permissions permissions;

    @BeforeEach
    public void setUp() {
        permissions = new Permissions();
    }

    @Test
    public void testGetName_Success() {
        String expected = "Permission1";
        permissions.setResourceName(expected); 
        String actual = permissions.getResourceName(); 
        assertEquals(expected, actual, "The method getResourceName() should return the correct name");
    }

    @Test
    public void testGetName_Failure() {
        String expected = "Permission2";
        permissions.setResourceName("Permission1"); 
        String actual = permissions.getResourceName(); 
        assertEquals(expected, actual, "The method getResourceName() should not return an incorrect name");
    }
}
