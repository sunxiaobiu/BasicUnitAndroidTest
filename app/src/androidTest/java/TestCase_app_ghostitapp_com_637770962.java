import android.opengl.EGL14;
import android.opengl.EGLContext;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_app_ghostitapp_com_637770962 {
   @Test
   public void testCase() throws Exception {
      EGLContext var2 = EGL14.eglGetCurrentContext();
      Object var1 = EasyMock.createMock(EGLContext.class);
      var2.equals(var1);
   }
}
