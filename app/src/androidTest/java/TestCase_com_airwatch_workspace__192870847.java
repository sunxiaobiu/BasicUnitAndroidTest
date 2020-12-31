import android.app.WallpaperManager;
import android.content.Context;
import android.os.IBinder;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_airwatch_workspace__192870847 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      WallpaperManager var4 = WallpaperManager.getInstance(var3);
      Object var1 = EasyMock.createMock(IBinder.class);
      float var2 = 1.0F;
      var4.setWallpaperOffsets((IBinder)var1, var2, 0.0F);
   }
}
