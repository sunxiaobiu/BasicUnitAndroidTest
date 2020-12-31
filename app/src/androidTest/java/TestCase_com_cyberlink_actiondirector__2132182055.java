import android.opengl.GLES20;
import androidx.test.runner.AndroidJUnit4;
import java.nio.IntBuffer;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_cyberlink_actiondirector__2132182055 {
   public static void testCase() throws Exception {
      Object var0 = null;
      GLES20.glGetIntegerv(2978, (IntBuffer)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
