import android.opengl.GLES20;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_acs_beautifulautumnlwp_free_1111702924 {
   public static void testCase() throws Exception {
      byte var0 = 1;
      byte var1 = 1;
      int[] var2 = new int[1];
      int[] var3 = new int[1];
      int[] var4 = new int[1];
      byte[] var5 = new byte[1];
      GLES20.glGetActiveUniform(var0, var1, 64, var2, 0, var3, 0, var4, 0, var5, 0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
