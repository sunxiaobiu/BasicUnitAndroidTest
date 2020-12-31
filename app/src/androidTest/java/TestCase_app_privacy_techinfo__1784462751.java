import android.app.usage.UsageStatsManager;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_app_privacy_techinfo__1784462751 {
   @Test
   public void testCase() throws Exception {
      Context var5 = InstrumentationRegistry.getTargetContext();
      Object var6 = var5.getSystemService("usagestats");
      UsageStatsManager var7 = (UsageStatsManager)var6;
      long var1 = 1L;
      long var3 = 1L;
      var7.queryUsageStats(0, var1, var3);
   }
}
