import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_gears42_surelock_1663226028 {
   @Test
   public void testCase() throws Exception {
      Object var4 = EasyMock.createMock(DevicePolicyManager.class);
      Object var1 = EasyMock.createMock(ComponentName.class);
      long var2 = 1L;
      ((DevicePolicyManager)var4).setPasswordExpirationTimeout((ComponentName)var1, var2);
   }
}
