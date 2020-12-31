import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.UserHandle;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_airwatch_androidagent__1350062507 {
   @Test
   public void testCase() throws Exception {
      Context var5 = InstrumentationRegistry.getTargetContext();
      Object var6 = var5.getSystemService("device_policy");
      DevicePolicyManager var7 = (DevicePolicyManager)var6;
      Object var1 = EasyMock.createMock(ComponentName.class);
      Object var2 = EasyMock.createMock(Intent.class);
      Object var3 = EasyMock.createMock(ServiceConnection.class);
      Object var4 = EasyMock.createMock(UserHandle.class);
      var7.bindDeviceAdminServiceAsUser((ComponentName)var1, (Intent)var2, (ServiceConnection)var3, 1, (UserHandle)var4);
   }
}
