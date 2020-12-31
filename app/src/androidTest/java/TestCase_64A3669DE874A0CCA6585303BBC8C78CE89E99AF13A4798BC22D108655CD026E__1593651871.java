import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_64A3669DE874A0CCA6585303BBC8C78CE89E99AF13A4798BC22D108655CD026E__1593651871 {
   public static void testCase() throws Exception {
      int[] var0 = new int[1];
      byte var1 = 1;
      byte var2 = 1;
      Object var3 = EasyMock.createMock(Config.class);
      Bitmap.createBitmap(var0, 0, var1, var1, var2, (Config)var3);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
