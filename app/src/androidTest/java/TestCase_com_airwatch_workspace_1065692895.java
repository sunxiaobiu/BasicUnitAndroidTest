import android.net.wifi.WifiManager;
import androidx.test.runner.AndroidJUnit4;
import java.util.List;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_airwatch_workspace_1065692895 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(WifiManager.class);
      List var2 = ((WifiManager)var1).getConfiguredNetworks();
   }
}
