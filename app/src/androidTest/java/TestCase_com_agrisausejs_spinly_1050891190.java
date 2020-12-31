import android.opengl.GLES20;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_agrisausejs_spinly_1050891190 {
   public static void testCase() throws Exception {
      byte var0 = 1;
      int[] var1 = new int[1];
      GLES20.glDeleteTextures(var0, var1, 0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
