import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_catchingnow_icebox_103310130 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Object var3 = var2.getSystemService("device_policy");
      DevicePolicyManager var4 = (DevicePolicyManager)var3;
      Object var1 = EasyMock.createMock(ComponentName.class);
      var4.setBackupServiceEnabled((ComponentName)var1, true);
   }
}
