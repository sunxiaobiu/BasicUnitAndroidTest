import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_photorecovery_1835067005 {
   public static void testCase() throws Exception {
      String var0 = "android";
      Bitmap var1 = ThumbnailUtils.createVideoThumbnail(var0, 2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
