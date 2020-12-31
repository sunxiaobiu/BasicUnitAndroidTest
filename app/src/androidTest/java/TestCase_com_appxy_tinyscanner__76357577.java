import android.opengl.GLES20;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_appxy_tinyscanner__76357577 {
   public static void testCase() throws Exception {
      int[] var0 = new int[1];
      byte var1 = 1;
      GLES20.glGenFramebuffers(1, var0, var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
