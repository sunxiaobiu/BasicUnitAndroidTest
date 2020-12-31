import android.content.Context;
import android.content.IntentSender;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_gears42_surelock_2032350064 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      PackageManager var4 = var3.getPackageManager();
      PackageInstaller var5 = var4.getPackageInstaller();
      String var1 = "android";
      Object var2 = EasyMock.createMock(IntentSender.class);
      var5.uninstall(var1, (IntentSender)var2);
   }
}
