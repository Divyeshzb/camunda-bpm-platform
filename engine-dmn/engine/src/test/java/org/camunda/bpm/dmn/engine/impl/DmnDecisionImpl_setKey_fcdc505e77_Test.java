package org.camunda.bpm.dmn.engine.impl;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DmnDecisionImpl_setKey_fcdc505e77_Test {
    
    private DmnDecisionImpl dmnDecisionImpl;

    @Before
    public void setUp() {
        dmnDecisionImpl = new DmnDecisionImpl();
    }

    @Test
    public void testSetKeySuccess() {
        String key = "testKey";
        dmnDecisionImpl.setKey(key);
        assertEquals("The set key is not correct", key, dmnDecisionImpl.getKey());
    }

    @Test
    public void testSetKeyNull() {
        String key = null;
        dmnDecisionImpl.setKey(key);
        assertEquals("The set key is not correct", key, dmnDecisionImpl.getKey());
    }
}
