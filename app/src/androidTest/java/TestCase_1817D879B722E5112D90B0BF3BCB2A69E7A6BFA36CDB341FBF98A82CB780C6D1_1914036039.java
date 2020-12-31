import android.content.Context;
import android.telephony.TelephonyManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_1817D879B722E5112D90B0BF3BCB2A69E7A6BFA36CDB341FBF98A82CB780C6D1_1914036039 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Object var3 = var2.getSystemService("phone");
      TelephonyManager var4 = (TelephonyManager)var3;
      byte var1 = 1;
      var4.createForSubscriptionId(var1);
   }
}
