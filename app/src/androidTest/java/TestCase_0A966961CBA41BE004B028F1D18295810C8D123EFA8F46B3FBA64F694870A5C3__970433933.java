import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0A966961CBA41BE004B028F1D18295810C8D123EFA8F46B3FBA64F694870A5C3__970433933 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(EGLDisplay.class);
      Object var1 = EasyMock.createMock(EGLSurface.class);
      byte var2 = 1;
      int[] var3 = new int[1];
      EGL14.eglQuerySurface((EGLDisplay)var0, (EGLSurface)var1, var2, var3, 0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
