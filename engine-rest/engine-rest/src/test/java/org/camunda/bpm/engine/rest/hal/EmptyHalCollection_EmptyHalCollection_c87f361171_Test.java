package org.camunda.bpm.engine.rest.hal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class EmptyHalCollection_EmptyHalCollection_c87f361171_Test {

    private EmptyHalCollection emptyHalCollection;

    @BeforeEach
    public void setUp() {
        emptyHalCollection = new EmptyHalCollection();
    }

    @Test
    public void testEmptyHalCollectionConstructor() {
        assertNotNull(emptyHalCollection);
    }
}
