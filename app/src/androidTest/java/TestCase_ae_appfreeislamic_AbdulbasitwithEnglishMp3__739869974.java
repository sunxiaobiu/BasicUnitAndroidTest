import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_appfreeislamic_AbdulbasitwithEnglishMp3__739869974 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(EGLDisplay.class);
      Object var1 = EasyMock.createMock(EGLSurface.class);
      Object var2 = EasyMock.createMock(EGLContext.class);
      EGL14.eglMakeCurrent((EGLDisplay)var0, (EGLSurface)var1, (EGLSurface)var1, (EGLContext)var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
