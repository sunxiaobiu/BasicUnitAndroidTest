import android.app.ActivityManager;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_3FD3ECB86A6FA6F2E1466F64345F074EDF9DEF1656B8C0AB97F7B79901DB4D93_2079846951 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var2 = var1.getSystemService("activity");
      ActivityManager var3 = (ActivityManager)var2;
      boolean var4 = var3.isBackgroundRestricted();
   }
}
