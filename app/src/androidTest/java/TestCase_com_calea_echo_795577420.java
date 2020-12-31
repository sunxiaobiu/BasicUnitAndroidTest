import android.telephony.SmsMessage;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_calea_echo_795577420 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(SmsMessage.class);
      int var2 = ((SmsMessage)var1).getStatus();
   }
}
