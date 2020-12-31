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
public class TestCase_com_apptools_tools_batterysaver__1549967124 {
   @Test
   public void testCase() throws Exception {
      Context var5 = InstrumentationRegistry.getTargetContext();
      Object var6 = var5.getSystemService("usagestats");
      UsageStatsManager var7 = (UsageStatsManager)var6;
      long var1 = System.currentTimeMillis();
      long var3 = var1 - 60000L;
      List var8 = var7.queryUsageStats(4, var3, var1);
      Iterator var9 = var8.iterator();
      var6 = var9.next();
      UsageStats var10 = (UsageStats)var6;
      var1 = var10.getLastTimeStamp();
   }
}
