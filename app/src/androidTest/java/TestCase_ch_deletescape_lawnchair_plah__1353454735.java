import android.content.ComponentName;
import android.content.Context;
import android.content.pm.LauncherApps;
import android.os.UserHandle;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_deletescape_lawnchair_plah__1353454735 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      Object var4 = var3.getSystemService("launcherapps");
      LauncherApps var5 = (LauncherApps)var4;
      Object var1 = EasyMock.createMock(ComponentName.class);
      Object var2 = EasyMock.createMock(UserHandle.class);
      var5.isActivityEnabled((ComponentName)var1, (UserHandle)var2);
   }
}
