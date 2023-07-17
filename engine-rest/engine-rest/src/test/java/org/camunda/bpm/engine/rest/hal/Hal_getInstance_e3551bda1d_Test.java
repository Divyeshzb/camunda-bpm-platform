package org.camunda.bpm.engine.rest.hal;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class Hal_getInstance_e3551bda1d_Test {
    private Hal instance;

    @Before
    public void setUp() {
        instance = new Hal();
    }

    @Test
    public void testGetInstance_success() {
        Hal result = new Hal();
        assertEquals(instance, result);
    }

    @Test
    public void testGetInstance_failure() {
        instance = null;
        Hal result = new Hal();
        assertEquals(instance, result);
    }
}
