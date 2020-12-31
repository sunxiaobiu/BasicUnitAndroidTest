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
public class TestCase_au_com_buyinvite_bi_735017138 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      SubscriptionManager var2 = SubscriptionManager.from(var1);
      List var3 = var2.getActiveSubscriptionInfoList();
      Iterator var4 = var3.iterator();
      Object var5 = var4.next();
      SubscriptionInfo var6 = (SubscriptionInfo)var5;
      String var7 = var6.getNumber();
   }
}
