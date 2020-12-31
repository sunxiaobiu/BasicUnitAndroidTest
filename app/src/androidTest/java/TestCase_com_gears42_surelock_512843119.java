import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_gears42_surelock_512843119 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(DevicePolicyManager.class);
      Object var1 = EasyMock.createMock(ComponentName.class);
      byte var2 = 1;
      ((DevicePolicyManager)var3).setPasswordHistoryLength((ComponentName)var1, var2);
   }
}
