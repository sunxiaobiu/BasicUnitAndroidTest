import android.net.NetworkInfo.DetailedState;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiInfo;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_ad_maru_2113431104 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(SupplicantState.class);
      DetailedState var1 = WifiInfo.getDetailedStateOf((SupplicantState)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
