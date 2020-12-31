import android.content.Context;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.pm.PackageInstaller.SessionInfo;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import java.util.Iterator;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_airwatch_admin_samsungelm_421251217 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      PackageManager var2 = var1.getPackageManager();
      PackageInstaller var3 = var2.getPackageInstaller();
      List var4 = var3.getAllSessions();
      Iterator var5 = var4.iterator();
      Object var6 = var5.next();
      SessionInfo var7 = (SessionInfo)var6;
      int var8 = var7.getSessionId();
   }
}
