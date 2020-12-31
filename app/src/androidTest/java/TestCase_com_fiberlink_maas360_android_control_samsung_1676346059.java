import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_fiberlink_maas360_android_control_samsung_1676346059 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      Object var4 = var3.getSystemService("device_policy");
      DevicePolicyManager var5 = (DevicePolicyManager)var4;
      Object var1 = EasyMock.createMock(ComponentName.class);
      boolean var2 = true;
      var5.setStorageEncryption((ComponentName)var1, var2);
   }
}
