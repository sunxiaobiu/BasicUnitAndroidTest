import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_airwatch_workspace__314245312 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(WifiManager.class);
      Object var1 = EasyMock.createMock(WifiConfiguration.class);
      ((WifiManager)var2).updateNetwork((WifiConfiguration)var1);
   }
}
