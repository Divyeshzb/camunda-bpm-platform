package org.camunda.bpm.engine.rest.hal;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class HalLinker_getLinkedRelations_c9ab6ac73c_Test {

    @Mock
    private HalLinker halLinker;

    private Set<HalRelation> halRelations;

    @Before
    public void setUp() {
        halRelations = new HashSet<>();
        halRelations.add(new HalRelation());
        halRelations.add(new HalRelation());

        when(halLinker.getLinkedRelations()).thenReturn(halRelations);
    }

    @Test
    public void testGetLinkedRelations_Success() {
        Set<HalRelation> result = halLinker.getLinkedRelations();
        assertEquals(halRelations, result);
    }

    @Test
    public void testGetLinkedRelations_Empty() {
        when(halLinker.getLinkedRelations()).thenReturn(new HashSet<>());
        Set<HalRelation> result = halLinker.getLinkedRelations();
        assertEquals(0, result.size());
    }
}
