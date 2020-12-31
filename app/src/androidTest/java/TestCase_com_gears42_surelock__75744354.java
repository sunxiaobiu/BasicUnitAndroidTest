import android.content.Context;
import android.net.wifi.WifiManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_gears42_surelock__75744354 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Object var3 = var2.getSystemService("wifi");
      WifiManager var4 = (WifiManager)var3;
      byte var1 = 1;
      var4.disableNetwork(var1);
   }
}
