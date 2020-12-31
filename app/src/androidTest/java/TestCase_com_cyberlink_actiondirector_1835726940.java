import android.opengl.GLES20;
import androidx.test.runner.AndroidJUnit4;
import java.nio.Buffer;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_cyberlink_actiondirector_1835726940 {
   public static void testCase() throws Exception {
      byte var0 = 1;
      byte var1 = 1;
      Object var2 = null;
      GLES20.glTexSubImage2D(3553, 0, 0, 0, var0, var1, 6409, 5121, (Buffer)var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
