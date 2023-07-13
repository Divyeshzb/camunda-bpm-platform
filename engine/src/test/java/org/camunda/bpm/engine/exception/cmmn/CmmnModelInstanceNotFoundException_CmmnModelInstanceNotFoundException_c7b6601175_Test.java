package org.camunda.bpm.engine.exception.cmmn;

import org.camunda.bpm.model.cmmn.CmmnModelInstance;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class CmmnModelInstanceNotFoundException_CmmnModelInstanceNotFoundException_c7b6601175_Test {

    @Mock
    private CmmnModelInstance cmmnModelInstance;

    private CmmnModelInstanceNotFoundException exception;

    @Before
    public void setUp() {
        exception = new CmmnModelInstanceNotFoundException();
    }

    @Test
    public void testCmmnModelInstanceNotFoundException_NoArgConstructor() {
        assertNotNull(exception);
        assertNull(exception.getMessage());
    }

    @Test(expected = CmmnModelInstanceNotFoundException.class)
    public void testCmmnModelInstanceNotFoundException_ThrowsException() {
        when(cmmnModelInstance.getId()).thenThrow(new CmmnModelInstanceNotFoundException());
        cmmnModelInstance.getId();
    }
}
