import android.app.admin.DevicePolicyManager;
import android.app.admin.SystemUpdatePolicy;
import android.content.ComponentName;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_gears42_surelock_465689325 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(DevicePolicyManager.class);
      Object var1 = EasyMock.createMock(ComponentName.class);
      Object var2 = EasyMock.createMock(SystemUpdatePolicy.class);
      ((DevicePolicyManager)var3).setSystemUpdatePolicy((ComponentName)var1, (SystemUpdatePolicy)var2);
   }
}
