import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_at_fmzkino_android_384287660 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Bitmap.class);
      Icon var1 = Icon.createWithBitmap((Bitmap)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
