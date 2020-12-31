import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_camera360_lite_beauty_selfie_camera_106910502 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var2 = var1.getSystemService("device_policy");
      DevicePolicyManager var3 = (DevicePolicyManager)var2;
      boolean var4 = var3.getCameraDisabled((ComponentName)null);
   }
}
