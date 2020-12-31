import android.opengl.GLES20;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_acs_beautifulautumnlwp_free_438311901 {
   public static void testCase() throws Exception {
      byte var0 = 1;
      int[] var1 = new int[1];
      GLES20.glGetProgramiv(var0, 35721, var1, 0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
