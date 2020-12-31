import android.content.Context;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.pm.PackageInstaller.SessionCallback;
import android.os.Handler;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_airwatch_admin_samsungelm_237380618 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      PackageManager var4 = var3.getPackageManager();
      PackageInstaller var5 = var4.getPackageInstaller();
      Object var1 = EasyMock.createMock(SessionCallback.class);
      Object var2 = EasyMock.createMock(Handler.class);
      var5.registerSessionCallback((SessionCallback)var1, (Handler)var2);
   }
}
