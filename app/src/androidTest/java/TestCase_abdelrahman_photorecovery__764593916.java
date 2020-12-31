import android.graphics.Bitmap;
import android.graphics.Matrix;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_photorecovery__764593916 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Bitmap.class);
      byte var1 = 1;
      byte var2 = 1;
      Object var3 = EasyMock.createMock(Matrix.class);
      Bitmap.createBitmap((Bitmap)var0, 0, 0, var1, var2, (Matrix)var3, true);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
