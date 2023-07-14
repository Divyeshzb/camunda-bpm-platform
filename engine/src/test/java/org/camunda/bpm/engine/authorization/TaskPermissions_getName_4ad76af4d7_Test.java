import org.junit.Assert;
import org.junit.Test;

public class TaskPermissionsTest {

    @Test
    public void testSetName() {
        TaskPermissions taskPermissions = new TaskPermissions();
        taskPermissions.setName("Task1");
        Assert.assertEquals("Task1", taskPermissions.getName());
    }
}
