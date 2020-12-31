import android.content.Context;
import android.net.wifi.WifiManager;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyService;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_02723EE2F1D009B56CF234B40929A730ACC1D4A12D303EBC02F4812E3A2D01BA__1422523456 {
   @Test
   public void testCase() throws Exception {
      MyService var1 = new MyService();
      Context var2 = var1.getApplicationContext();
      Object var3 = var2.getSystemService("wifi");
      WifiManager var4 = (WifiManager)var3;
      var4.setWifiEnabled(true);
   }
}
