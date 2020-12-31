import android.app.admin.DeviceAdminReceiver;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_1E91B380BECAE9E6440F80A475A60127941E2549C25333B921EA09442D7D3593_869971055 {
   @Test
   public void testCase() throws Exception {
      DeviceAdminReceiver var2 = new DeviceAdminReceiver();
      Context var1 = InstrumentationRegistry.getTargetContext();
      var1 = var1.getApplicationContext();
      DevicePolicyManager var3 = var2.getManager(var1);
      Object var4 = EasyMock.createMock(ComponentName.class);
      var3.getWifiMacAddress((ComponentName)var4);
   }
}
