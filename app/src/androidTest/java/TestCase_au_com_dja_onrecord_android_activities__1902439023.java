import android.app.AppOpsManager;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_dja_onrecord_android_activities__1902439023 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      Object var4 = var3.getSystemService("appops");
      AppOpsManager var5 = (AppOpsManager)var4;
      byte var1 = 1;
      String var2 = "android";
      var5.checkPackage(var1, var2);
   }
}
