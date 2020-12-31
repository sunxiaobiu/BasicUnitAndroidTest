import android.app.admin.DevicePolicyManager;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_ahnlab_v3mobileplus_1417500409 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var2 = var1.getSystemService("device_policy");
      DevicePolicyManager var3 = (DevicePolicyManager)var2;
      List var4 = var3.getActiveAdmins();
   }
}
