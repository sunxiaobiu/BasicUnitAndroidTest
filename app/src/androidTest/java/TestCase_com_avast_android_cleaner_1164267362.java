import android.app.usage.NetworkStatsManager;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_avast_android_cleaner_1164267362 {
   @Test
   public void testCase() throws Exception {
      Context var4 = InstrumentationRegistry.getTargetContext();
      Object var5 = var4.getSystemService("netstats");
      NetworkStatsManager var6 = (NetworkStatsManager)var5;
      long var1 = 1L;
      byte var3 = 1;
      var6.queryDetailsForUid(1, "", 0L, var1, var3);
   }
}
