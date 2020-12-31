import android.net.wifi.p2p.WifiP2pManager;
import android.net.wifi.p2p.WifiP2pManager.Channel;
import android.net.wifi.p2p.WifiP2pManager.GroupInfoListener;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_toyota_dashcamviewer__2050261723 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(WifiP2pManager.class);
      Object var1 = EasyMock.createMock(Channel.class);
      Object var2 = null;
      ((WifiP2pManager)var3).requestGroupInfo((Channel)var1, (GroupInfoListener)var2);
   }
}
