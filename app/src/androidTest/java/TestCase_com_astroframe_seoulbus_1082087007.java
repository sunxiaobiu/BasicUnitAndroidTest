import android.telephony.gsm.SmsMessage;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_astroframe_seoulbus_1082087007 {
   public static void testCase() throws Exception {
      byte[] var0 = new byte[1];
      SmsMessage var1 = SmsMessage.createFromPdu(var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
