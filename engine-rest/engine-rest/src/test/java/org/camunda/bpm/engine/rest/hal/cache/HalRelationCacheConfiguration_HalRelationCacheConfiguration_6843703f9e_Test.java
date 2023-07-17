package org.camunda.bpm.engine.rest.hal.cache;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class HalRelationCacheConfiguration_HalRelationCacheConfiguration_6843703f9e_Test {

    private HalRelationCacheConfiguration halRelationCacheConfiguration;

    @BeforeEach
    public void setup() {
        halRelationCacheConfiguration = new HalRelationCacheConfiguration();
    }

    @Test
    public void testHalRelationCacheConfiguration_ValidConfiguration() {
        assertDoesNotThrow(() -> {
            halRelationCacheConfiguration = new HalRelationCacheConfiguration();
        });
    }

    @Test
    public void testHalRelationCacheConfiguration_InvalidConfiguration() {
        assertThrows(RuntimeException.class, () -> {
            halRelationCacheConfiguration = new HalRelationCacheConfiguration();
        });
    }

}
