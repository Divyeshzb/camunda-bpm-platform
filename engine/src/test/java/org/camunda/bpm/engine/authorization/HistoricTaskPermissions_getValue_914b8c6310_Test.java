import org.junit.Test;
import static org.junit.Assert.*;

public class HistoricTaskPermissionsTest {

    @Test
    public void testHistoricTaskPermissions() {
        HistoricTaskPermissions[] permissions = HistoricTaskPermissions.values();
        assertEquals(2, permissions.length);
        assertEquals(HistoricTaskPermissions.CREATE, permissions[0]);
        assertEquals(HistoricTaskPermissions.DELETE, permissions[1]);
    }
}
