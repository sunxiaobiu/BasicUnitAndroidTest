import android.content.Intent;
import android.provider.Telephony.Sms.Intents;
import android.telephony.SmsMessage;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_astroframe_seoulbus_653406933 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Intent.class);
      SmsMessage[] var1 = Intents.getMessagesFromIntent((Intent)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
