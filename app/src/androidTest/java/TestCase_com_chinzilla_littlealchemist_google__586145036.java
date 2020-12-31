import android.opengl.GLSurfaceView.EGLContextFactory;
import androidx.test.runner.AndroidJUnit4;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_chinzilla_littlealchemist_google__586145036 {
   @Test
   public void testCase() throws Exception {
      Object var4 = EasyMock.createMock(EGLContextFactory.class);
      Object var1 = null;
      Object var2 = null;
      Object var3 = null;
      ((EGLContextFactory)var4).destroyContext((EGL10)var1, (EGLDisplay)var2, (EGLContext)var3);
   }
}
