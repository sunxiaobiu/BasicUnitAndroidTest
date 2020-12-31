import android.graphics.PixelFormat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_cloudmosa_puffinAcademy__790229396 {
   public static void testCase() throws Exception {
      byte var0 = 1;
      Object var1 = EasyMock.createMock(PixelFormat.class);
      PixelFormat.getPixelFormatInfo(var0, (PixelFormat)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
