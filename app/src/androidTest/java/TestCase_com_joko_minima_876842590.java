import android.app.WallpaperInfo;
import android.app.WallpaperManager;
import android.content.ComponentName;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_joko_minima_876842590 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      WallpaperManager var2 = WallpaperManager.getInstance(var1);
      WallpaperInfo var3 = var2.getWallpaperInfo();
      ComponentName var4 = var3.getComponent();
   }
}
