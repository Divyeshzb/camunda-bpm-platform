package org.camunda.bpm.engine.authorization;

import org.junit.Assert;
import org.junit.Test;

public enum Permissions {
    TestName, UnexpectedName;
}

public class Permissions_getName_4ad76af4d7_Test {

    @Test
    public void testGetName_Success() {
        String expectedName = "TestName";
        Permissions permissions = Permissions.valueOf(expectedName);

        String actualName = permissions.name();

        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testGetName_Failure() {
        String unexpectedName = "UnexpectedName";
        Permissions permissions = Permissions.valueOf(unexpectedName);

        String actualName = permissions.name();

        Assert.assertNotEquals("TestName", actualName);
    }
}
