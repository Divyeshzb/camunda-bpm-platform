package org.camunda.bpm.engine.rest.hal;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.TreeMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HalResource_addEmbeddedObject_4760c64718_Test {

    private HalResource halResource;

    @Before
    public void setup() {
        halResource = new HalResource();
    }

    @Test
    public void testAddEmbeddedObject() {
        String name = "testName";
        Object embedded = new Object();

        halResource.addEmbeddedObject(name, embedded);

        TreeMap<String, Object> _embedded = halResource.get_embedded();
        assertNotNull(_embedded);
        assertEquals(embedded, _embedded.get(name));
    }

    @Test
    public void testAddEmbeddedObject_NullName() {
        String name = null;
        Object embedded = new Object();

        halResource.addEmbeddedObject(name, embedded);

        TreeMap<String, Object> _embedded = halResource.get_embedded();
        assertNotNull(_embedded);
        assertEquals(embedded, _embedded.get(name));
    }

    @Test(expected = NullPointerException.class)
    public void testAddEmbeddedObject_NullObject() {
        String name = "testName";
        Object embedded = null;

        halResource.addEmbeddedObject(name, embedded);
    }
}
