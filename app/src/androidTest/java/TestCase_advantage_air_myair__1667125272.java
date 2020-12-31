import android.content.Context;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiManager.MulticastLock;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import java.lang.ref.WeakReference;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_advantage_air_myair__1667125272 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      WeakReference var1 = new WeakReference(var2);
      Object var3 = var1.get();
      var2 = (Context)var3;
      var3 = var2.getSystemService("wifi");
      WifiManager var4 = (WifiManager)var3;
      MulticastLock var5 = var4.createMulticastLock("Myair5");
      var5.acquire();
   }
}
