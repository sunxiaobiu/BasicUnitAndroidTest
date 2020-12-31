import android.content.Context;
import android.telephony.SubscriptionManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0B6FA025C2240BD6CC80BA2F9608D5625C6AC5B76DD04E13C58AA9643A7FB4A1__1421128962 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      SubscriptionManager var2 = SubscriptionManager.from(var1);
      int var3 = var2.getActiveSubscriptionInfoCountMax();
   }
}
