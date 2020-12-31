import android.opengl.GLES20;
import androidx.test.runner.AndroidJUnit4;
import java.nio.FloatBuffer;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_seek__1638370845 {
   public static void testCase() throws Exception {
      byte var0 = 1;
      byte var1 = 1;
      Object var2 = null;
      GLES20.glUniformMatrix4fv(var0, var1, false, (FloatBuffer)var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
