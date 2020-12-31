import android.content.Context;
import android.content.pm.PackageManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_huawei_phoneservice_1573187271 {
   @Test
   public void testCase() throws Exception {
      Context var4 = InstrumentationRegistry.getTargetContext();
      PackageManager var5 = var4.getPackageManager();
      Object var1 = null;
      Object var2 = null;
      String var3 = "android";
      var5.getPreferredActivities((List)var1, (List)var2, var3);
   }
}
