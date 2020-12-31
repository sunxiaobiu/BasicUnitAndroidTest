import android.content.Context;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdManager.DiscoveryListener;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0AC04D188191527E19751048FD3C4794CA0D39CF95F4636C04F7755CD917882E__547819996 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      var2 = var2.getApplicationContext();
      Object var3 = var2.getSystemService("servicediscovery");
      NsdManager var4 = (NsdManager)var3;
      Object var1 = EasyMock.createMock(DiscoveryListener.class);
      var4.stopServiceDiscovery((DiscoveryListener)var1);
   }
}
