import android.telephony.SmsMessage;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_asroma_mobile__1094689787 {
   public static void testCase() throws Exception {
      byte[] var0 = new byte[1];
      SmsMessage var1 = SmsMessage.createFromPdu(var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
