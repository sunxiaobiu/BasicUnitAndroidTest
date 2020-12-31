import android.net.wifi.p2p.WifiP2pManager;
import android.net.wifi.p2p.WifiP2pManager.ActionListener;
import android.net.wifi.p2p.WifiP2pManager.Channel;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyService;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_co_acetone_acadly__1972765433 {
   @Test
   public void testCase() throws Exception {
      MyService var2 = new MyService();
      Object var3 = var2.getSystemService("wifip2p");
      WifiP2pManager var4 = (WifiP2pManager)var3;
      Object var1 = EasyMock.createMock(Channel.class);
      var4.cancelConnect((Channel)var1, (ActionListener)null);
   }
}
