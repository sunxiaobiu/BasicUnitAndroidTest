import android.opengl.EGL14;
import android.opengl.EGLSurface;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_zem_scanarplus_415470482 {
   public static void testCase() throws Exception {
      EGLSurface var0 = EGL14.eglGetCurrentSurface(12377);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
