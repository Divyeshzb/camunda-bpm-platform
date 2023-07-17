package org.camunda.bpm.engine.rest.hal;

import org.camunda.bpm.engine.ProcessEngine;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class HalLinker_getLinkedResourceIdsByRelation_522af908f4_Test {

    @Mock
    private HalRelation halRelation;

    @Mock
    private Map<HalRelation, Set<String>> linkedResources;

    private HalLinker halLinker;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        halLinker = new HalLinker();
    }

    @Test
    public void testGetLinkedResourceIdsByRelation_whenRelationExists() {
        Set<String> expectedResourceIds = new HashSet<>(Arrays.asList("resource1", "resource2"));
        when(linkedResources.get(halRelation)).thenReturn(expectedResourceIds);

        Set<String> actualResourceIds = halLinker.getLinkedResourceIdsByRelation(halRelation);

        assertEquals(expectedResourceIds, actualResourceIds);
    }

    @Test
    public void testGetLinkedResourceIdsByRelation_whenRelationDoesNotExist() {
        when(linkedResources.get(halRelation)).thenReturn(null);

        Set<String> actualResourceIds = halLinker.getLinkedResourceIdsByRelation(halRelation);

        assertEquals(Collections.emptySet(), actualResourceIds);
    }
}
