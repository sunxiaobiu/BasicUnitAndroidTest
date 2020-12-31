import android.content.Context;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiManager.WifiLock;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyService;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_dev47apps_droidcam_1858631615 {
   @Test
   public void testCase() throws Exception {
      MyService var1 = new MyService();
      Context var2 = InstrumentationRegistry.getTargetContext();
      Object var3 = var2.getSystemService("wifi");
      WifiManager var4 = (WifiManager)var3;
      WifiLock var5 = var4.createWifiLock("DroidCamWifiLock");
   }
}
