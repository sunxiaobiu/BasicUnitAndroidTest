import android.net.wifi.p2p.WifiP2pManager;
import android.net.wifi.p2p.WifiP2pManager.Channel;
import android.net.wifi.p2p.WifiP2pManager.PeerListListener;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_6191546028C21779EAA699CF303977F093D48A2256D8EE52A39F5C3C7A4FDB6E__508846336 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(WifiP2pManager.class);
      Object var1 = EasyMock.createMock(Channel.class);
      Object var2 = null;
      ((WifiP2pManager)var3).requestPeers((Channel)var1, (PeerListListener)var2);
   }
}
