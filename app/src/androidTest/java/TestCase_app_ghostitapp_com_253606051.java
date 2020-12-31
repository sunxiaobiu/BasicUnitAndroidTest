import android.opengl.GLES20;
import androidx.test.runner.AndroidJUnit4;
import java.nio.Buffer;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_app_ghostitapp_com_253606051 {
   public static void testCase() throws Exception {
      byte var0 = 1;
      Object var1 = null;
      GLES20.glVertexAttribPointer(var0, 3, 5126, false, 20, (Buffer)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
