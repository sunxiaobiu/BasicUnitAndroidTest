import android.content.Context;
import android.content.pm.LauncherApps;
import android.content.pm.ShortcutInfo;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_deletescape_lawnchair_plah__263299734 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      Object var4 = var3.getSystemService("launcherapps");
      LauncherApps var5 = (LauncherApps)var4;
      Object var1 = EasyMock.createMock(ShortcutInfo.class);
      byte var2 = 1;
      var5.getShortcutIconDrawable((ShortcutInfo)var1, var2);
   }
}
