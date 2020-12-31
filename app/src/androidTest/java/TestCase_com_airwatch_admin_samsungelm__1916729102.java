import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_airwatch_admin_samsungelm__1916729102 {
   @Test
   public void testCase() throws Exception {
      Context var4 = InstrumentationRegistry.getTargetContext();
      Object var5 = var4.getSystemService("device_policy");
      DevicePolicyManager var6 = (DevicePolicyManager)var5;
      Object var1 = EasyMock.createMock(ComponentName.class);
      String var2 = "android";
      String var3 = "android";
      var6.getPermissionGrantState((ComponentName)var1, var2, var3);
   }
}
