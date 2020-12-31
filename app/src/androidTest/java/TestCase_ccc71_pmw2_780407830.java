import android.app.usage.NetworkStatsManager;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ccc71_pmw2_780407830 {
   @Test
   public void testCase() throws Exception {
      Context var6 = InstrumentationRegistry.getTargetContext();
      Object var7 = var6.getSystemService("netstats");
      NetworkStatsManager var8 = (NetworkStatsManager)var7;
      String var1 = "android";
      long var2 = 1L;
      long var4 = 1L;
      var8.queryDetails(0, var1, var2, var4);
   }
}
