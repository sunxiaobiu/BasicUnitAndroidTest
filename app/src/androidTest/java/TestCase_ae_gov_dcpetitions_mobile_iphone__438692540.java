import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_dcpetitions_mobile_iphone__438692540 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      SharedPreferences var3 = var2.getSharedPreferences("com.arellomobile.android.push.deviceid", 2);
      Editor var4 = var3.edit();
      String var1 = "android";
      var4.putString("deviceid", var1);
   }
}
