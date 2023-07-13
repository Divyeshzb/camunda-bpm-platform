import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProcessDefinitionPermissionsTest {
    private ProcessDefinitionPermissions processDefinitionPermissions;

    @Before
    public void setUp() {
        processDefinitionPermissions = new ProcessDefinitionPermissions();
    }

    @Test
    public void testNameSetterGetter() {
        String testName = "TestName";
        processDefinitionPermissions.setName(testName);
        Assert.assertEquals(testName, processDefinitionPermissions.getName());
    }

    @Test
    public void testIdSetterGetter() {
        int testId = 123;
        processDefinitionPermissions.setId(testId);
        Assert.assertEquals(testId, processDefinitionPermissions.getId());
    }
}
