import android.app.WallpaperManager;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_deletescape_lawnchair_plah__751272035 {
   @Test
   public void testCase() throws Exception {
      Context var5 = InstrumentationRegistry.getTargetContext();
      WallpaperManager var6 = WallpaperManager.getInstance(var5);
      Object var1 = EasyMock.createMock(IBinder.class);
      String var2 = "android";
      byte var3 = 1;
      byte var4 = 1;
      var6.sendWallpaperCommand((IBinder)var1, var2, var3, var4, 0, (Bundle)null);
   }
}
