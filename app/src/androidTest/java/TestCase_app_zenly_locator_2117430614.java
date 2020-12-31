import android.telephony.TelephonyManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_app_zenly_locator_2117430614 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(TelephonyManager.class);
      byte var1 = 1;
      ((TelephonyManager)var2).getSimState(var1);
   }
}
