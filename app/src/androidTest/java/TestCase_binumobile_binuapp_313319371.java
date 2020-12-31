import android.content.Context;
import android.telephony.SubscriptionManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_binumobile_binuapp_313319371 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Object var3 = var2.getSystemService("telephony_subscription_service");
      SubscriptionManager var4 = (SubscriptionManager)var3;
      byte var1 = 1;
      var4.getActiveSubscriptionInfoForSimSlotIndex(var1);
   }
}
