import org.junit.Test;
import static org.junit.Assert.*;

public class CaseExceptionTest {
    @Test
    public void testCaseException() {
        String message = "Test Message";
        CaseException exception = new CaseException(message);
        assertEquals(message, exception.getMessage());
    }
}
