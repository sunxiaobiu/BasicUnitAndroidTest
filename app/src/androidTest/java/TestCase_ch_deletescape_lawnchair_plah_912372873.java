import android.content.Context;
import android.content.pm.LauncherApps;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_deletescape_lawnchair_plah_912372873 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var2 = var1.getSystemService("launcherapps");
      LauncherApps var3 = (LauncherApps)var2;
      boolean var4 = var3.hasShortcutHostPermission();
   }
}
