import android.opengl.GLES20;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_app_ghostitapp_com_655279691 {
   public static void testCase() throws Exception {
      byte var0 = 1;
      GLES20.glDeleteProgram(var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
