import android.graphics.Bitmap;
import android.opengl.GLUtils;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_26F500A0DF729916E6AEC771392B1658E4801351AA84DA1540D757BFE1A20C60_1146510710 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Bitmap.class);
      GLUtils.texSubImage2D(3553, 0, 0, 0, (Bitmap)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
