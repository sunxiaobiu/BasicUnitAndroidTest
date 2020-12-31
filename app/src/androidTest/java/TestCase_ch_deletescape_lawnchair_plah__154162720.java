import android.content.Context;
import android.content.pm.LauncherApps;
import android.os.UserHandle;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import java.util.List;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_deletescape_lawnchair_plah__154162720 {
   @Test
   public void testCase() throws Exception {
      Context var4 = InstrumentationRegistry.getTargetContext();
      Object var5 = var4.getSystemService("launcherapps");
      LauncherApps var6 = (LauncherApps)var5;
      String var1 = "android";
      Object var2 = null;
      Object var3 = EasyMock.createMock(UserHandle.class);
      var6.pinShortcuts(var1, (List)var2, (UserHandle)var3);
   }
}
