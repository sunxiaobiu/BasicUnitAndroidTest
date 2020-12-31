import android.telephony.SmsMessage;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_calea_echo_357470053 {
   public static void testCase() throws Exception {
      String var0 = "android";
      int[] var1 = SmsMessage.calculateLength(var0, false);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
