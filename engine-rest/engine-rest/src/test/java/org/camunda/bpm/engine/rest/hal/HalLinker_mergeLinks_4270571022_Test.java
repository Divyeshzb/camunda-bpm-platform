package org.camunda.bpm.engine.rest.hal;

import org.camunda.bpm.engine.ProcessEngine;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.*;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class HalLinker_mergeLinks_4270571022_Test {

    @Mock
    private HalResource<?> embedded;

    private HalLinker testHalLinker;
    private Map<HalRelation, Set<String>> linkedResources;

    @Before
    public void setup() {
        linkedResources = new HashMap<>();
        testHalLinker = new HalLinker();
        testHalLinker.setLinkedResources(linkedResources);
    }

    @Test
    public void testMergeLinks_WhenLinkedIdSetNotNull() {
        HalRelation relation = new HalRelation();
        relation.setName("testRelation");
        Set<String> linkedIdSet = new HashSet<>(Arrays.asList("test1", "test2"));
        linkedResources.put(relation, linkedIdSet);

        Set<String> newLinkedIdSet = new HashSet<>(Arrays.asList("test3", "test4"));
        when(embedded.getLinker().getLinkedResources().entrySet()).thenReturn(new AbstractMap.SimpleEntry<>(relation, newLinkedIdSet));

        testHalLinker.mergeLinks(embedded);

        Set<String> expectedLinkedIdSet = new HashSet<>(Arrays.asList("test1", "test2", "test3", "test4"));
        assertEquals(expectedLinkedIdSet, linkedResources.get(relation));
    }

    @Test
    public void testMergeLinks_WhenLinkedIdSetNull() {
        HalRelation relation = new HalRelation();
        relation.setName("testRelation");
        Set<String> newLinkedIdSet = new HashSet<>(Arrays.asList("test3", "test4"));
        when(embedded.getLinker().getLinkedResources().entrySet()).thenReturn(new AbstractMap.SimpleEntry<>(relation, newLinkedIdSet));

        testHalLinker.mergeLinks(embedded);

        assertEquals(newLinkedIdSet, linkedResources.get(relation));
    }
}
