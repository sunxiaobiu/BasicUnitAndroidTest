import android.app.WallpaperManager;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_boostcharge_standard_launcher__1390953975 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      WallpaperManager var2 = WallpaperManager.getInstance(var1);
      var2.forgetLoadedWallpaper();
   }
}
