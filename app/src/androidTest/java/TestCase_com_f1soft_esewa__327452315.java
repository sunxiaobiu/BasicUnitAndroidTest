import android.graphics.Bitmap;
import android.support.v4.graphics.BitmapCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_f1soft_esewa__327452315 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Bitmap.class);
      int var1 = BitmapCompat.getAllocationByteCount((Bitmap)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
