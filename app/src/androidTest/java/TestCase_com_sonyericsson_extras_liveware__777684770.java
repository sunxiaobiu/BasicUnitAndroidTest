import android.net.wifi.p2p.WifiP2pDevice;
import android.net.wifi.p2p.WifiP2pGroup;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_sonyericsson_extras_liveware__777684770 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(WifiP2pGroup.class);
      WifiP2pDevice var2 = ((WifiP2pGroup)var1).getOwner();
   }
}
