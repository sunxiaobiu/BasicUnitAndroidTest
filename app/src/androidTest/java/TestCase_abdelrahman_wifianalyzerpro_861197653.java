import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_wifianalyzerpro_861197653 {
   public static void testCase() throws Exception {
      byte var0 = 1;
      byte var1 = 1;
      Object var2 = EasyMock.createMock(Config.class);
      Bitmap.createBitmap(var0, var1, (Config)var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
