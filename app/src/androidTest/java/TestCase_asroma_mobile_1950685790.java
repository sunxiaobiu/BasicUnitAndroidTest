import android.telephony.SmsMessage;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_asroma_mobile_1950685790 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(SmsMessage.class);
      String var2 = ((SmsMessage)var1).getDisplayMessageBody();
   }
}
