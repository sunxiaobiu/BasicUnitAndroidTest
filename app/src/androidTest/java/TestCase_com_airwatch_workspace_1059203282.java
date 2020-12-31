import android.net.wifi.WifiEnterpriseConfig;
import androidx.test.runner.AndroidJUnit4;
import java.security.cert.X509Certificate;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_airwatch_workspace_1059203282 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(WifiEnterpriseConfig.class);
      Object var1 = null;
      ((WifiEnterpriseConfig)var2).setCaCertificate((X509Certificate)var1);
   }
}
