import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_wifianalyzerpro__419066689 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      SharedPreferences var4 = var3.getSharedPreferences("TwoStageRate", 0);
      Editor var5 = var4.edit();
      String var1 = "android";
      byte var2 = 1;
      var5.putInt(var1, var2);
   }
}
