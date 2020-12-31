import android.content.ComponentName;
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
public class TestCase_ch_deletescape_lawnchair_plah_936602782 {
   @Test
   public void testCase() throws Exception {
      Context var5 = InstrumentationRegistry.getTargetContext();
      Object var6 = var5.getSystemService("launcherapps");
      LauncherApps var7 = (LauncherApps)var6;
      Object var1 = EasyMock.createMock(ComponentName.class);
      Object var2 = EasyMock.createMock(UserHandle.class);
      Object var3 = EasyMock.createMock(Rect.class);
      Object var4 = EasyMock.createMock(Bundle.class);
      var7.startMainActivity((ComponentName)var1, (UserHandle)var2, (Rect)var3, (Bundle)var4);
   }
}
