import android.opengl.GLES20;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_appxy_tinyscanner__384336159 {
   public static void testCase() throws Exception {
      byte var0 = 1;
      GLES20.glFramebufferTexture2D(36160, 36064, 3553, var0, 0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
