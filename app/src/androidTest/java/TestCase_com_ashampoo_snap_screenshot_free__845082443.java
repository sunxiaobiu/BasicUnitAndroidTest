import android.media.Image;
import android.media.ImageReader;
import android.util.DisplayMetrics;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_ashampoo_snap_screenshot_free__845082443 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(DisplayMetrics.class);
      int var1 = ((DisplayMetrics)var3).heightPixels;
      int var2 = var1;
      var1 = ((DisplayMetrics)var3).widthPixels;
      ImageReader var4 = ImageReader.newInstance(var1, var2, 1, 2);
      Image var5 = var4.acquireLatestImage();
      var5.close();
   }
}
