import android.content.Context;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiManager.MulticastLock;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_alensw_PicFolder__313801295 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var2 = var1.getSystemService("wifi");
      WifiManager var3 = (WifiManager)var2;
      MulticastLock var4 = var3.createMulticastLock("quickpic.discovery");
      boolean var5 = var4.isHeld();
   }
}
