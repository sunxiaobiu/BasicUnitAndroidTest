import android.net.wifi.WifiManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_014117FE8FF081C26E42C43B5EAEA0246CE8A15FDE0BED5DD61231948A8E2EF6__1339624269 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(WifiManager.class);
      boolean var2 = ((WifiManager)var1).isWifiEnabled();
   }
}
