// Test generated by RoostGPT for test Camunda-engine-dmn using AI Type Open AI and AI Model gpt-4

package org.camunda.bpm.dmn.engine.impl;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.camunda.bpm.dmn.engine.DmnDecision;
import org.camunda.bpm.dmn.engine.impl.spi.transform.DmnTransformer;
import org.camunda.bpm.model.dmn.DmnModelInstance;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultDmnEngine_parseDecisions_bd368c489b_Test {

    @Mock
    private DmnTransformer transformer;

    @InjectMocks
    private DefaultDmnEngine defaultDmnEngine;

    private DmnModelInstance dmnModelInstance;

    @Before
    public void setUp() {
        dmnModelInstance = mock(DmnModelInstance.class);
    }

    @Test
    public void testParseDecisions_Success() {
        List<DmnDecision> expectedDecisions = new ArrayList<>();
        expectedDecisions.add(mock(DmnDecision.class));

        when(transformer.createTransform().modelInstance(dmnModelInstance).transformDecisions()).thenReturn(expectedDecisions);

        List<DmnDecision> actualDecisions = defaultDmnEngine.parseDecisions(dmnModelInstance);

        verify(transformer).createTransform().modelInstance(dmnModelInstance).transformDecisions();
        assertEquals(expectedDecisions, actualDecisions);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDecisions_NullDmnModelInstance() {
        defaultDmnEngine.parseDecisions(null);
    }

    @Test
    public void testParseDecisions_EmptyDecisions() {
        List<DmnDecision> expectedDecisions = new ArrayList<>();

        when(transformer.createTransform().modelInstance(dmnModelInstance).transformDecisions()).thenReturn(expectedDecisions);

        List<DmnDecision> actualDecisions = defaultDmnEngine.parseDecisions(dmnModelInstance);

        verify(transformer).createTransform().modelInstance(dmnModelInstance).transformDecisions();
        assertTrue(actualDecisions.isEmpty());
    }
}