package org.camunda.bpm.engine.authorization;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Permissions_toString_2393b88875_Test {

    @Test
    public void testToStringSuccess() {
        Permissions permissions = Permissions.READ; // replace READ with an actual permission if it's different
        String expected = "READ"; // replace READ with the expected string representation of the permission
        String actual = permissions.toString();
        assertEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void testToStringNull() {
        Permissions permissions = null;
        try {
            String actual = permissions.toString();
        } catch (NullPointerException e) {
            throw new NullPointerException();
        }
    }
}
