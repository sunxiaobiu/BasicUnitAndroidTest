import android.net.wifi.WifiInfo;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ca_tsn_mobile_android__136276590 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(WifiInfo.class);
      int var2 = ((WifiInfo)var1).getFrequency();
   }
}
