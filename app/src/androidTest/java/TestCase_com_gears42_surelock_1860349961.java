import android.app.WallpaperManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_gears42_surelock_1860349961 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      WallpaperManager var3 = WallpaperManager.getInstance(var2);
      Object var1 = EasyMock.createMock(Bitmap.class);
      var3.setBitmap((Bitmap)var1, (Rect)null, true, 2);
   }
}
