import android.net.wifi.p2p.WifiP2pManager;
import android.net.wifi.p2p.WifiP2pManager.ActionListener;
import android.net.wifi.p2p.WifiP2pManager.Channel;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_6191546028C21779EAA699CF303977F093D48A2256D8EE52A39F5C3C7A4FDB6E__1499920470 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(WifiP2pManager.class);
      Object var1 = EasyMock.createMock(Channel.class);
      Object var2 = null;
      ((WifiP2pManager)var3).stopPeerDiscovery((Channel)var1, (ActionListener)var2);
   }
}
