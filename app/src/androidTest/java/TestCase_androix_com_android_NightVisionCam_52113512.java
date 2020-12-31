import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_androix_com_android_NightVisionCam_52113512 {
   public static void testCase() throws Exception {
      int[] var0 = new int[1];
      byte var1 = 1;
      byte var2 = 1;
      Object var3 = EasyMock.createMock(Config.class);
      Bitmap.createBitmap(var0, var1, var2, (Config)var3);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
