import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_active_aps_pbk__905569518 {
   @Test
   public void testCase() throws Exception {
      Context var4 = InstrumentationRegistry.getTargetContext();
      PackageManager var5 = var4.getPackageManager();
      String var1 = "android";
      byte var2 = 1;
      Object var3 = EasyMock.createMock(ApplicationInfo.class);
      var5.getText(var1, var2, (ApplicationInfo)var3);
   }
}
