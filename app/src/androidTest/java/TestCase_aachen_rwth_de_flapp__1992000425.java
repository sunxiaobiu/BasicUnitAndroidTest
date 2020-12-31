import android.graphics.Bitmap;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aachen_rwth_de_flapp__1992000425 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Bitmap.class);
      byte var1 = 1;
      byte var2 = 1;
      Bitmap.createScaledBitmap((Bitmap)var0, var1, var2, true);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
