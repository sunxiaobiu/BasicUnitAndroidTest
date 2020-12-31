import android.telephony.SmsManager;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_calea_echo__352245011 {
   public static void testCase() throws Exception {
      byte var0 = 1;
      SmsManager var1 = SmsManager.getSmsManagerForSubscriptionId(var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
