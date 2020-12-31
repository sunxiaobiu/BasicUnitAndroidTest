import android.content.Context;
import android.telephony.TelephonyManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_buyinvite_bi_1648795858 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      var1 = var1.getApplicationContext();
      Object var2 = var1.getSystemService("phone");
      TelephonyManager var3 = (TelephonyManager)var2;
      String var4 = var3.getVoiceMailNumber();
   }
}
