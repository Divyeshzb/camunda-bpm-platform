package org.camunda.bpm.engine.rest.hal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import javax.ws.rs.core.UriBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HalRelation_build_caaadaf711_Test {

    private UriBuilder uriBuilder;

    @BeforeEach
    public void setUp() {
        uriBuilder = UriBuilder.fromPath("http://localhost:8080");
    }

    @Test
    public void testBuild_Success() {
        String relName = "testRel";
        Class<?> resourceType = String.class;
        HalRelation relation = new HalRelation();
        relation.build(relName, resourceType, uriBuilder);

        assertNotNull(relation);
        assertEquals(relName, relation.relName);
        assertEquals(resourceType, relation.resourceType);
        assertEquals(uriBuilder, relation.uriTemplate);
    }

    @Test
    public void testBuild_NullRelName() {
        String relName = null;
        Class<?> resourceType = String.class;
        HalRelation relation = new HalRelation();
        relation.build(relName, resourceType, uriBuilder);

        assertNotNull(relation);
        assertNull(relation.relName);
        assertEquals(resourceType, relation.resourceType);
        assertEquals(uriBuilder, relation.uriTemplate);
    }

    @Test
    public void testBuild_NullResourceType() {
        String relName = "testRel";
        Class<?> resourceType = null;
        HalRelation relation = new HalRelation();
        relation.build(relName, resourceType, uriBuilder);

        assertNotNull(relation);
        assertEquals(relName, relation.relName);
        assertNull(relation.resourceType);
        assertEquals(uriBuilder, relation.uriTemplate);
    }

    @Test
    public void testBuild_NullUriBuilder() {
        String relName = "testRel";
        Class<?> resourceType = String.class;
        UriBuilder uriBuilder = null;
        HalRelation relation = new HalRelation();
        relation.build(relName, resourceType, uriBuilder);

        assertNotNull(relation);
        assertEquals(relName, relation.relName);
        assertEquals(resourceType, relation.resourceType);
        assertNull(relation.uriTemplate);
    }
}
