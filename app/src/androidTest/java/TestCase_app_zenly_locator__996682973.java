import android.telephony.TelephonyManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_app_zenly_locator__996682973 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(TelephonyManager.class);
      int var2 = ((TelephonyManager)var1).getPhoneCount();
   }
}
