import android.app.WallpaperManager;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_airwatch_workspace__195179192 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      WallpaperManager var3 = WallpaperManager.getInstance(var2);
      float var1 = 1.0F;
      var3.setWallpaperOffsetSteps(var1, 0.0F);
   }
}
