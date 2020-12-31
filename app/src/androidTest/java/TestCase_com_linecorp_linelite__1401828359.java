import android.opengl.GLES20;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_linecorp_linelite__1401828359 {
   public static void testCase() throws Exception {
      GLES20.glDepthMask(false);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
