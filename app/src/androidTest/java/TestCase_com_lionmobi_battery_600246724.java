import android.app.AppOpsManager;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_lionmobi_battery_600246724 {
   @Test
   public void testCase() throws Exception {
      Context var4 = InstrumentationRegistry.getTargetContext();
      Object var5 = var4.getSystemService(AppOpsManager.class);
      AppOpsManager var6 = (AppOpsManager)var5;
      byte var1 = 1;
      String var2 = "android";
      String var3 = "android";
      var6.noteOp(var2, var1, var3);
   }
}
