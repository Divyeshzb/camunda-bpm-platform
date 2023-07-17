package org.camunda.bpm.engine.rest.hal;

import javax.ws.rs.core.UriBuilder;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class HalRelation_getUriTemplate_cc65a9ad39_Test {

    private UriBuilder uriTemplate;
    private HalRelation halRelation;

    @BeforeEach
    public void setUp() {
        uriTemplate = Mockito.mock(UriBuilder.class);
        halRelation = new HalRelation();
        halRelation.setUriTemplate(uriTemplate);
    }

    @Test
    public void testGetUriTemplate_Success() {
        UriBuilder expectedUriTemplate = uriTemplate;
        UriBuilder actualUriTemplate = halRelation.getUriTemplate();
        assertEquals(expectedUriTemplate, actualUriTemplate, "UriBuilder should match expected UriBuilder");
    }

    @Test
    public void testGetUriTemplate_Null() {
        halRelation.setUriTemplate(null);
        UriBuilder actualUriTemplate = halRelation.getUriTemplate();
        assertEquals(null, actualUriTemplate, "UriBuilder should be null");
    }
}
