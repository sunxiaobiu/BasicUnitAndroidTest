import android.content.Context;
import android.content.pm.LauncherApps;
import android.content.pm.LauncherApps.Callback;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_deletescape_lawnchair_plah_260146830 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Object var3 = var2.getSystemService("launcherapps");
      LauncherApps var4 = (LauncherApps)var3;
      Object var1 = null;
      var4.registerCallback((Callback)var1);
   }
}
