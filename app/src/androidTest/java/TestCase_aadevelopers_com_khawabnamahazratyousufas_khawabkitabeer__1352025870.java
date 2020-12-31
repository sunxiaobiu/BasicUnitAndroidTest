import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aadevelopers_com_khawabnamahazratyousufas_khawabkitabeer__1352025870 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var2 = var1.getSystemService("wifi");
      WifiManager var3 = (WifiManager)var2;
      WifiInfo var4 = var3.getConnectionInfo();
      int var5 = var4.getRssi();
   }
}
