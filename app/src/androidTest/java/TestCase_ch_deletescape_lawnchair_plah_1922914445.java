import android.content.Context;
import android.content.pm.LauncherApps;
import android.os.UserHandle;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_deletescape_lawnchair_plah_1922914445 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      Object var4 = var3.getSystemService("launcherapps");
      LauncherApps var5 = (LauncherApps)var4;
      String var1 = "android";
      Object var2 = EasyMock.createMock(UserHandle.class);
      var5.getActivityList(var1, (UserHandle)var2);
   }
}
