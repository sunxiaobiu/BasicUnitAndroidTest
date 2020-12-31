import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_airwatch_admin_samsungelm_117725956 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      Object var4 = var3.getSystemService("device_policy");
      DevicePolicyManager var5 = (DevicePolicyManager)var4;
      Object var1 = EasyMock.createMock(ComponentName.class);
      Object var2 = EasyMock.createMock(Bundle.class);
      var5.setApplicationRestrictions((ComponentName)var1, "com.google.android.gms", (Bundle)var2);
   }
}
