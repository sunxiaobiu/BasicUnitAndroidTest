import android.net.wifi.p2p.WifiP2pManager;
import android.net.wifi.p2p.WifiP2pManager.ActionListener;
import android.net.wifi.p2p.WifiP2pManager.Channel;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyService;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_02723EE2F1D009B56CF234B40929A730ACC1D4A12D303EBC02F4812E3A2D01BA__1142860618 {
   @Test
   public void testCase() throws Exception {
      MyService var3 = new MyService();
      Object var4 = var3.getSystemService("wifip2p");
      WifiP2pManager var5 = (WifiP2pManager)var4;
      Object var1 = EasyMock.createMock(Channel.class);
      Object var2 = null;
      var5.removeGroup((Channel)var1, (ActionListener)var2);
   }
}
