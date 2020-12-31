import android.net.nsd.NsdServiceInfo;
import androidx.test.runner.AndroidJUnit4;
import java.net.InetAddress;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_nosixfive_liquid_285572573 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(NsdServiceInfo.class);
      InetAddress var2 = ((NsdServiceInfo)var1).getHost();
   }
}
