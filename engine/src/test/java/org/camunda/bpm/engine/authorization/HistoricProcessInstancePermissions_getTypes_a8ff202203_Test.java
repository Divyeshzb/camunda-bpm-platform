package org.camunda.bpm.engine.authorization;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class HistoricProcessInstancePermissions_getTypes_a8ff202203_Test {

    private Resource[] RESOURCES;

    @BeforeEach
    public void setup() {
        RESOURCES = new Resource[] {new Resource(), new Resource()};
    }

    @Test
    public void testGetTypes_Success() {
        Resource[] actualResources = getTypes();
        assertArrayEquals(RESOURCES, actualResources, "Expected resources did not match actual resources");
    }

    @Test
    public void testGetTypes_Empty() {
        RESOURCES = new Resource[] {};
        Resource[] actualResources = getTypes();
        assertArrayEquals(RESOURCES, actualResources, "Expected resources did not match actual resources");
    }

    public Resource[] getTypes() {
        return RESOURCES.clone();
    }

    public static class Resource {
        public Resource() {}

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Resource resource = (Resource) obj;
            return true;
        }

        @Override
        public int hashCode() {
            return 1;
        }
    }
}
