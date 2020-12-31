import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.util.DisplayMetrics;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_avaya_spaces__1521743416 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(DisplayMetrics.class);
      byte var1 = 1;
      Object var2 = EasyMock.createMock(Config.class);
      Bitmap.createBitmap((DisplayMetrics)var0, var1, var1, (Config)var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
