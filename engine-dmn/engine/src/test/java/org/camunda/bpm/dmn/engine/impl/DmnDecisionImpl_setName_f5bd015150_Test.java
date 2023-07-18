// Test generated by RoostGPT for test Camunda-engine-dmn using AI Type Open AI and AI Model gpt-4

package org.camunda.bpm.dmn.engine.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DmnDecisionImpl_setName_f5bd015150_Test {

    private DmnDecisionImpl decision;

    @BeforeEach
    void setUp() {
        decision = new DmnDecisionImpl();
    }

    @Test
    void testSetName() {
        String expectedName = "TestName";
        decision.setName(expectedName);
        assertEquals(expectedName, decision.getName());
    }

    @Test
    void testSetNameWithNull() {
        String expectedName = null;
        decision.setName(expectedName);
        assertNull(decision.getName());
    }
}
