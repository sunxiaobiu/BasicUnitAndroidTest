import android.content.Context;
import android.telephony.TelephonyManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_hb_dialer_free_1309075079 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Object var3 = var2.getSystemService(TelephonyManager.class);
      TelephonyManager var4 = (TelephonyManager)var3;
      String var1 = "android";
      var4.sendDialerSpecialCode(var1);
   }
}
