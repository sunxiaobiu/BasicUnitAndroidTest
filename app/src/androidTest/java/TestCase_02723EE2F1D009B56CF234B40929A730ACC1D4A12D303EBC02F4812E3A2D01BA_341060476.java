import android.net.wifi.p2p.WifiP2pConfig;
import android.net.wifi.p2p.WifiP2pManager;
import android.net.wifi.p2p.WifiP2pManager.ActionListener;
import android.net.wifi.p2p.WifiP2pManager.Channel;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyService;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_02723EE2F1D009B56CF234B40929A730ACC1D4A12D303EBC02F4812E3A2D01BA_341060476 {
   @Test
   public void testCase() throws Exception {
      MyService var4 = new MyService();
      Object var5 = var4.getSystemService("wifip2p");
      WifiP2pManager var6 = (WifiP2pManager)var5;
      Object var1 = EasyMock.createMock(Channel.class);
      Object var2 = EasyMock.createMock(WifiP2pConfig.class);
      Object var3 = null;
      var6.createGroup((Channel)var1, (WifiP2pConfig)var2, (ActionListener)var3);
   }
}
