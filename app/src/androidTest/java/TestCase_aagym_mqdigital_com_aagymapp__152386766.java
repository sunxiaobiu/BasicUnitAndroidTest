import android.content.Context;
import android.content.pm.PackageManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aagym_mqdigital_com_aagymapp__152386766 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      PackageManager var3 = var2.getPackageManager();
      String var1 = "android";
      var3.getResourcesForApplication(var1);
   }
}
