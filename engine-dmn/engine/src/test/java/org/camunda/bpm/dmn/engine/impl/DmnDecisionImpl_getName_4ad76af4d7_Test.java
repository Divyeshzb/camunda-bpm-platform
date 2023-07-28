package org.camunda.bpm.dmn.engine.impl;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DmnDecisionImpl_getName_4ad76af4d7_Test {

    private DmnDecisionImpl dmnDecisionImpl;

    @Before
    public void setUp() {
        dmnDecisionImpl = new DmnDecisionImpl();
        dmnDecisionImpl.setName("TestName");
    }

    @Test
    public void testGetName_Success() {
        String expectedName = "TestName";
        String actualName = dmnDecisionImpl.getName();
        assertEquals(expectedName, actualName);
    }

    @Test
    public void testGetName_Failure() {
        String unexpectedName = "WrongName";
        String actualName = dmnDecisionImpl.getName();
        assertNotEquals(unexpectedName, actualName);
    }
}
