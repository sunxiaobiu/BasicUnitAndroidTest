import android.telephony.SubscriptionInfo;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_callapp_contacts__82917981 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(SubscriptionInfo.class);
      int var2 = ((SubscriptionInfo)var1).getSubscriptionId();
   }
}
