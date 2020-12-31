import android.net.wifi.ScanResult;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_farproc_wifi_analyzer_classic_400634894 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(ScanResult.class);
      boolean var2 = ((ScanResult)var1).isPasspointNetwork();
   }
}
