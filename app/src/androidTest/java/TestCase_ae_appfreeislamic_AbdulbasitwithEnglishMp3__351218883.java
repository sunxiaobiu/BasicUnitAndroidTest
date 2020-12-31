import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_appfreeislamic_AbdulbasitwithEnglishMp3__351218883 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(EGLDisplay.class);
      Object var1 = EasyMock.createMock(EGLContext.class);
      EGL14.eglDestroyContext((EGLDisplay)var0, (EGLContext)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
