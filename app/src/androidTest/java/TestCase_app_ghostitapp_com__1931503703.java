import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.view.Surface;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_app_ghostitapp_com__1931503703 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(EGLDisplay.class);
      Object var1 = EasyMock.createMock(EGLConfig.class);
      Object var2 = EasyMock.createMock(Surface.class);
      int[] var3 = new int[1];
      EGL14.eglCreateWindowSurface((EGLDisplay)var0, (EGLConfig)var1, var2, var3, 0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
