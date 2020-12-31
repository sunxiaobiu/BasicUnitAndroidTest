import android.net.wifi.p2p.WifiP2pManager;
import android.net.wifi.p2p.WifiP2pManager.ChannelListener;
import android.os.Looper;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyService;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_02723EE2F1D009B56CF234B40929A730ACC1D4A12D303EBC02F4812E3A2D01BA__1328908044 {
   @Test
   public void testCase() throws Exception {
      MyService var4 = new MyService();
      Object var1 = var4.getSystemService("wifip2p");
      WifiP2pManager var5 = (WifiP2pManager)var1;
      Object var2 = EasyMock.createMock(Looper.class);
      Object var3 = null;
      var5.initialize(var4, (Looper)var2, (ChannelListener)var3);
   }
}
