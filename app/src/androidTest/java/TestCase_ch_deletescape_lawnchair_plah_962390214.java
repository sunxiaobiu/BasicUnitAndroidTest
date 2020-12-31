import android.content.Context;
import android.content.pm.LauncherApps;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.UserHandle;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_deletescape_lawnchair_plah_962390214 {
   @Test
   public void testCase() throws Exception {
      Context var6 = InstrumentationRegistry.getTargetContext();
      Object var7 = var6.getSystemService("launcherapps");
      LauncherApps var8 = (LauncherApps)var7;
      String var1 = "android";
      String var2 = "android";
      Object var3 = EasyMock.createMock(Rect.class);
      Object var4 = EasyMock.createMock(Bundle.class);
      Object var5 = EasyMock.createMock(UserHandle.class);
      var8.startShortcut(var1, var2, (Rect)var3, (Bundle)var4, (UserHandle)var5);
   }
}
