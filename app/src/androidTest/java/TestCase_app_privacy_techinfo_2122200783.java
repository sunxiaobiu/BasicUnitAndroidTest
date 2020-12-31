import android.app.usage.UsageStats;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import java.util.Iterator;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_app_privacy_techinfo_2122200783 {
   @Test
   public void testCase() throws Exception {
      Context var5 = InstrumentationRegistry.getTargetContext();
      Object var6 = var5.getSystemService("usagestats");
      UsageStatsManager var7 = (UsageStatsManager)var6;
      long var1 = System.currentTimeMillis();
      long var3 = var1 - 1000000L;
      List var8 = var7.queryUsageStats(0, var3, var1);
      Iterator var9 = var8.iterator();
      var6 = var9.next();
      UsageStats var10 = (UsageStats)var6;
      var1 = var10.getLastTimeUsed();
   }
}
