import android.graphics.Bitmap;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aang_ind_reefal__1680181064 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Bitmap.class);
      byte var1 = 1;
      byte var2 = 1;
      Bitmap.createBitmap((Bitmap)var0, 0, 0, var1, var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
