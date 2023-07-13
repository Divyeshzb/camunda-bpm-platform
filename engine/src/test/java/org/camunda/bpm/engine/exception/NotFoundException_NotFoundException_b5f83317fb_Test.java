package org.camunda.bpm.engine.exception;

import org.camunda.bpm.engine.BadUserRequestException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NotFoundException_NotFoundException_b5f83317fb_Test {

    @InjectMocks
    NotFoundException notFoundException;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        notFoundException = new NotFoundException();
    }

    @Test
    public void testNotFoundExceptionInstanceCreation() {
        assertNotNull(notFoundException);
    }

    @Test(expected = NotFoundException.class)
    public void testNotFoundExceptionThrowsBadUserRequestException() {
        throw notFoundException;
    }
}
