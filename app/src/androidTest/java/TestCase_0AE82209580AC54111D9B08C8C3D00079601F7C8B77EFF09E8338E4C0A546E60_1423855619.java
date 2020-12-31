import android.content.Context;
import android.content.pm.PackageManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0AE82209580AC54111D9B08C8C3D00079601F7C8B77EFF09E8338E4C0A546E60_1423855619 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      PackageManager var3 = var2.getPackageManager();
      String var1 = "android";
      var3.getPermissionGroupInfo(var1, 0);
   }
}
