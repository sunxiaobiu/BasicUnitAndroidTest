import android.graphics.Bitmap;
import android.opengl.GLUtils;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_seek__300487610 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Bitmap.class);
      GLUtils.texImage2D(3553, 0, (Bitmap)var0, 0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
