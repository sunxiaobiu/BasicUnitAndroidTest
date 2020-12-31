import android.net.wifi.WifiEnterpriseConfig;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_airwatch_workspace_255526761 {
   @Test
   public void testCase() throws Exception {
      WifiEnterpriseConfig var2 = new WifiEnterpriseConfig();
      byte var1 = 1;
      var2.setPhase2Method(var1);
   }
}
