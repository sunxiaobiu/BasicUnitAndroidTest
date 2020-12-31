import android.opengl.GLES20;
import androidx.test.runner.AndroidJUnit4;
import java.nio.Buffer;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_app_ghostitapp_com_1583947092 {
   public static void testCase() throws Exception {
      byte var0 = 1;
      byte var1 = 1;
      Object var2 = null;
      GLES20.glReadPixels(0, 0, var0, var1, 6408, 5121, (Buffer)var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
