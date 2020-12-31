import android.app.WallpaperManager;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_health_lab_drink_water_tracker__684554671 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      WallpaperManager var2 = WallpaperManager.getInstance(var1);
      int var3 = var2.getWallpaperId(1);
   }
}
