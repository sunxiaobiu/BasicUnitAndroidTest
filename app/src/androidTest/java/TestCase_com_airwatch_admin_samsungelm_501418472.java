import android.content.Context;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.pm.PackageInstaller.SessionCallback;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_airwatch_admin_samsungelm_501418472 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      PackageManager var3 = var2.getPackageManager();
      PackageInstaller var4 = var3.getPackageInstaller();
      Object var1 = EasyMock.createMock(SessionCallback.class);
      var4.unregisterSessionCallback((SessionCallback)var1);
   }
}
