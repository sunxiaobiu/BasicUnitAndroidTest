import android.opengl.GLES20;
import androidx.test.runner.AndroidJUnit4;
import java.nio.Buffer;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_gameloft_android_ANMP_GloftGF2F__2104726306 {
   public static void testCase() throws Exception {
      byte var0 = 1;
      byte var1 = 1;
      Object var2 = null;
      GLES20.glDrawElements(var0, var1, 5123, (Buffer)var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
