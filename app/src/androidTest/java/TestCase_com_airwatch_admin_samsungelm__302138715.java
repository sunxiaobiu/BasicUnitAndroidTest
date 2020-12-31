import android.app.admin.DevicePolicyManager;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_airwatch_admin_samsungelm__302138715 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Object var3 = var2.getSystemService("device_policy");
      DevicePolicyManager var4 = (DevicePolicyManager)var3;
      String var1 = "android";
      var4.isDeviceOwnerApp(var1);
   }
}
