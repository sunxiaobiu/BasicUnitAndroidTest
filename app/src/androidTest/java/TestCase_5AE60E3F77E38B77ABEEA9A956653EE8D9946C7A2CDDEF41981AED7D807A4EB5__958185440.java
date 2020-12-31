import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5AE60E3F77E38B77ABEEA9A956653EE8D9946C7A2CDDEF41981AED7D807A4EB5__958185440 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Bitmap.class);
      byte var1 = 1;
      byte var2 = 1;
      ThumbnailUtils.extractThumbnail((Bitmap)var0, var1, var2, 2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
