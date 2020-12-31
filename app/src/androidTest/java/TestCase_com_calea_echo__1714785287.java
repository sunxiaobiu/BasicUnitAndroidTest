import android.content.Context;
import android.telephony.SubscriptionManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_calea_echo__1714785287 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      SubscriptionManager var3 = SubscriptionManager.from(var2);
      byte var1 = 1;
      var3.getActiveSubscriptionInfo(var1);
   }
}
