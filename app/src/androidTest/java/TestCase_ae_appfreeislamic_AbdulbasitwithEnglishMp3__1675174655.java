import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_appfreeislamic_AbdulbasitwithEnglishMp3__1675174655 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(EGLDisplay.class);
      int[] var1 = new int[1];
      Object var2 = EasyMock.createMock(EGLConfig[].class);
      int[] var3 = new int[1];
      EGL14.eglChooseConfig((EGLDisplay)var0, var1, 0, (EGLConfig[])var2, 0, 1, var3, 0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
