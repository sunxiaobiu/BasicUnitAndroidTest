import android.net.wifi.p2p.WifiP2pManager;
import android.net.wifi.p2p.WifiP2pManager.ActionListener;
import android.net.wifi.p2p.WifiP2pManager.Channel;
import android.net.wifi.p2p.nsd.WifiP2pDnsSdServiceRequest;
import android.net.wifi.p2p.nsd.WifiP2pServiceRequest;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyService;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_co_acetone_acadly__308414194 {
   @Test
   public void testCase() throws Exception {
      MyService var4 = new MyService();
      Object var5 = var4.getSystemService("wifip2p");
      WifiP2pManager var6 = (WifiP2pManager)var5;
      Object var1 = EasyMock.createMock(Channel.class);
      Object var2 = EasyMock.createMock(WifiP2pDnsSdServiceRequest.class);
      Object var3 = null;
      var6.removeServiceRequest((Channel)var1, (WifiP2pServiceRequest)var2, (ActionListener)var3);
   }
}
