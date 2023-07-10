package org.camunda.bpm.application;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class AbstractProcessApplication_getRawObject_4cebb6137e_Test {

    private AbstractProcessApplication abstractProcessApplication;

    @BeforeEach
    public void setup() {
        abstractProcessApplication = new AbstractProcessApplication() {
            @Override
            public String getName() {
                return "TestApplication";
            }
        };
    }

    @Test
    public void testGetRawObject_Success() {
        ProcessApplicationInterface result = abstractProcessApplication.getRawObject();
        assertNotNull(result, "Expected non-null result");
        assertEquals(abstractProcessApplication, result, "Expected result to match the original object");
    }

    @Test
    public void testGetRawObject_Failure() {
        AbstractProcessApplication nullAbstractProcessApplication = null;
        assertThrows(NullPointerException.class, () -> {
            ProcessApplicationInterface result = nullAbstractProcessApplication.getRawObject();
        }, "Expected NullPointerException when calling getRawObject on null object");
    }
}
