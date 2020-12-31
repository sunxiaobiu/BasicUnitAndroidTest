import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_no_nrksuper_app__1251772230 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Bitmap.class);
      byte var1 = 1;
      ThumbnailUtils.extractThumbnail((Bitmap)var0, var1, var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
