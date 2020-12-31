import android.net.wifi.WifiEnterpriseConfig;
import androidx.test.runner.AndroidJUnit4;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_airwatch_workspace_1419979618 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(WifiEnterpriseConfig.class);
      Object var1 = null;
      Object var2 = null;
      ((WifiEnterpriseConfig)var3).setClientKeyEntry((PrivateKey)var1, (X509Certificate)var2);
   }
}
