import android.net.wifi.p2p.WifiP2pManager;
import android.net.wifi.p2p.WifiP2pManager.ActionListener;
import android.net.wifi.p2p.WifiP2pManager.Channel;
import android.net.wifi.p2p.nsd.WifiP2pDnsSdServiceInfo;
import android.net.wifi.p2p.nsd.WifiP2pServiceInfo;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyService;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_co_acetone_acadly_2082687574 {
   @Test
   public void testCase() throws Exception {
      MyService var3 = new MyService();
      Object var4 = var3.getSystemService("wifip2p");
      WifiP2pManager var5 = (WifiP2pManager)var4;
      Object var1 = EasyMock.createMock(Channel.class);
      Object var2 = EasyMock.createMock(WifiP2pDnsSdServiceInfo.class);
      var5.removeLocalService((Channel)var1, (WifiP2pServiceInfo)var2, (ActionListener)null);
   }
}
