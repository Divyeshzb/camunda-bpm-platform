package org.camunda.bpm.dmn.engine.impl;

import org.camunda.bpm.dmn.engine.DmnDecisionLogic;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DmnDecisionImpl_setDecisionLogic_9ae9040465_Test {

    private DmnDecisionImpl decisionImpl;
    private DmnDecisionLogic decisionLogicMock;

    @BeforeEach
    public void setup() {
        decisionImpl = new DmnDecisionImpl();
        decisionLogicMock = Mockito.mock(DmnDecisionLogic.class);
    }

    @Test
    public void testSetDecisionLogic() {
        decisionImpl.setDecisionLogic(decisionLogicMock);
        assertEquals(decisionLogicMock, decisionImpl.getDecisionLogic(), "The decision logic should match the one set");
    }

    @Test
    public void testSetDecisionLogic_Null() {
        assertThrows(NullPointerException.class, () -> decisionImpl.setDecisionLogic(null), "Setting null decision logic should throw NullPointerException");
    }
}
