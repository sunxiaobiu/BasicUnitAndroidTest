import android.net.wifi.p2p.WifiP2pManager;
import android.net.wifi.p2p.WifiP2pManager.Channel;
import android.net.wifi.p2p.WifiP2pManager.DnsSdServiceResponseListener;
import android.net.wifi.p2p.WifiP2pManager.DnsSdTxtRecordListener;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyService;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_co_acetone_acadly__1168496529 {
   @Test
   public void testCase() throws Exception {
      MyService var4 = new MyService();
      Object var5 = var4.getSystemService("wifip2p");
      WifiP2pManager var6 = (WifiP2pManager)var5;
      Object var1 = EasyMock.createMock(Channel.class);
      Object var2 = null;
      Object var3 = null;
      var6.setDnsSdResponseListeners((Channel)var1, (DnsSdServiceResponseListener)var2, (DnsSdTxtRecordListener)var3);
   }
}
