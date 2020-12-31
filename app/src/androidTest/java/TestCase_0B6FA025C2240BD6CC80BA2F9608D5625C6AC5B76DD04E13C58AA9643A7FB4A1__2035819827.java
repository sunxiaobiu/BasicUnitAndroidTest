import android.content.Context;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import java.util.Iterator;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0B6FA025C2240BD6CC80BA2F9608D5625C6AC5B76DD04E13C58AA9643A7FB4A1__2035819827 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      SubscriptionManager var2 = SubscriptionManager.from(var1);
      List var3 = var2.getActiveSubscriptionInfoList();
      Iterator var4 = var3.iterator();
      Object var5 = var4.next();
      SubscriptionInfo var6 = (SubscriptionInfo)var5;
      int var7 = var6.getMnc();
   }
}
