import android.content.Context;
import android.content.SharedPreferences;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_wifianalyzerpro__1245783143 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      SharedPreferences var4 = var3.getSharedPreferences("TwoStageRate", 0);
      long var1 = var4.getLong("TWOSTAGEINSTALLDATE", 0L);
   }
}
