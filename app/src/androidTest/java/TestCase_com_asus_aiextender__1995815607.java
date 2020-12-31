import android.content.Context;
import android.net.DhcpInfo;
import android.net.wifi.WifiManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_asus_aiextender__1995815607 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var2 = var1.getSystemService("wifi");
      WifiManager var3 = (WifiManager)var2;
      DhcpInfo var4 = var3.getDhcpInfo();
      String var5 = var4.toString();
   }
}
