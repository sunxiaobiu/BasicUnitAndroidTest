import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_app_ghostitapp_com_235626782 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(EGLDisplay.class);
      Object var1 = EasyMock.createMock(EGLSurface.class);
      EGL14.eglSwapBuffers((EGLDisplay)var0, (EGLSurface)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
