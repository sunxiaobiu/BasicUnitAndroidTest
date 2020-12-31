import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_appfreeislamic_AbdulbasitwithEnglishMp3_1596028178 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(EGLDisplay.class);
      Object var1 = EasyMock.createMock(EGLConfig.class);
      int[] var2 = new int[1];
      EGL14.eglCreatePbufferSurface((EGLDisplay)var0, (EGLConfig)var1, var2, 0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
