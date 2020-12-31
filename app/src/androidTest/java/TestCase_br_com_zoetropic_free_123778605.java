import android.opengl.GLES20;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_br_com_zoetropic_free_123778605 {
   public static void testCase() throws Exception {
      byte var0 = 1;
      float var1 = 1.0F;
      GLES20.glUniform1f(var0, var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
