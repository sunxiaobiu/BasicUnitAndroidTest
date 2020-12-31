import android.telephony.TelephonyManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5CF673D1FB84F6FE3FC05A9CDAC69C24FB1790D5E76886F2E0DB8947074EE08E_1386078388 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(TelephonyManager.class);
      String var2 = ((TelephonyManager)var1).getMeid(0);
   }
}
