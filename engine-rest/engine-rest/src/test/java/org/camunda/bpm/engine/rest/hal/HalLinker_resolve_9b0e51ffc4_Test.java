package org.camunda.bpm.engine.rest.hal;

import org.camunda.bpm.engine.ProcessEngine;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class HalLinker_resolve_9b0e51ffc4_Test {

    @Mock
    private Hal hal;

    @Mock
    private HalLinkResolver halLinkResolver;

    @Mock
    private HalRelation halRelation;

    @Mock
    private ProcessEngine processEngine;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testResolve_withValidRelation() {
        when(halRelation.getResourceType()).thenReturn("validResourceType");
        when(hal.getLinkResolver(halRelation.getResourceType())).thenReturn(halLinkResolver);
        Set<String> linkedIds = new HashSet<>();
        linkedIds.add("id1");
        linkedIds.add("id2");
        when(halLinkResolver.resolveLinks(linkedIds.toArray(new String[linkedIds.size()]), processEngine)).thenReturn(Collections.emptyList());

        List<HalResource<?>> result = hal.resolve(halRelation, processEngine);

        verify(halLinkResolver, times(1)).resolveLinks(any(), eq(processEngine));
        assertNotNull(result);
    }

    @Test
    public void testResolve_withInvalidRelation() {
        when(halRelation.getResourceType()).thenReturn("invalidResourceType");
        when(hal.getLinkResolver(halRelation.getResourceType())).thenReturn(null);

        Exception exception = assertThrows(RuntimeException.class, () -> {
            hal.resolve(halRelation, processEngine);
        });

        String expectedMessage = "Cannot find HAL link resolver for resource type 'invalidResourceType'.";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
