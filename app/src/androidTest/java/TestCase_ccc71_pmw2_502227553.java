import android.app.usage.UsageStatsManager;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ccc71_pmw2_502227553 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Object var3 = var2.getSystemService("usagestats");
      UsageStatsManager var4 = (UsageStatsManager)var3;
      String var1 = "android";
      var4.isAppInactive(var1);
   }
}
