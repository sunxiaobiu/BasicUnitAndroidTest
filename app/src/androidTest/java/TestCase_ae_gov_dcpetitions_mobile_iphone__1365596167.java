import android.content.Context;
import android.content.SharedPreferences;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_dcpetitions_mobile_iphone__1365596167 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      SharedPreferences var2 = var1.getSharedPreferences("com.arellomobile.android.push.deviceid", 2);
      String var3 = var2.getString("deviceid", (String)"android");
   }
}
