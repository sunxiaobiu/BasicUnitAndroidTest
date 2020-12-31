import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_appfreeislamic_AbdulbasitwithEnglishMp3__205626573 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(EGLContext.class);
      Object var1 = EasyMock.createMock(EGLDisplay.class);
      Object var2 = EasyMock.createMock(EGLConfig.class);
      int[] var3 = new int[1];
      EGL14.eglCreateContext((EGLDisplay)var1, (EGLConfig)var2, (EGLContext)var0, var3, 0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
