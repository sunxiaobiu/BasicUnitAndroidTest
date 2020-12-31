import android.content.Context;
import android.telephony.PhoneNumberUtils;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_hb_dialer_free_324474970 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      String var1 = "android";
      PhoneNumberUtils.isLocalEmergencyNumber((Context)var0, var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
