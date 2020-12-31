import android.net.nsd.NsdServiceInfo;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_nosixfive_liquid_497475678 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(NsdServiceInfo.class);
      int var2 = ((NsdServiceInfo)var1).getPort();
   }
}
