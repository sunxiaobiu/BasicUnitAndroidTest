import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_appfreeislamic_AbdulbasitwithEnglishMp3__2138218144 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(EGLDisplay.class);
      int[] var1 = new int[1];
      EGL14.eglInitialize((EGLDisplay)var0, var1, 0, var1, 1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
