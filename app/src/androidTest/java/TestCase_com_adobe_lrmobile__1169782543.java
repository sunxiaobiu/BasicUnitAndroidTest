import android.opengl.GLES30;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_adobe_lrmobile__1169782543 {
   public static void testCase() throws Exception {
      int[] var0 = new int[1];
      GLES30.glDeleteTextures(1, var0, 0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
