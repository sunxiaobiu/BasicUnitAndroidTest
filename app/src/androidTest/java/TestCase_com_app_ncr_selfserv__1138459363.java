import android.opengl.GLSurfaceView;
import android.os.IBinder;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_app_ncr_selfserv__1138459363 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(GLSurfaceView.class);
      IBinder var2 = ((GLSurfaceView)var1).getWindowToken();
   }
}
