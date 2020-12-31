import android.telephony.SmsMessage;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_edunext_bism__1092705696 {
   public static void testCase() throws Exception {
      byte[] var0 = new byte[1];
      String var1 = "android";
      SmsMessage.createFromPdu(var0, var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
