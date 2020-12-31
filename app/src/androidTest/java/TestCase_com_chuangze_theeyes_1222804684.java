import android.opengl.GLSurfaceView;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_chuangze_theeyes_1222804684 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(SurfaceView.class);
      GLSurfaceView var3 = (GLSurfaceView)var2;
      Object var1 = EasyMock.createMock(SurfaceHolder.class);
      var3.surfaceDestroyed((SurfaceHolder)var1);
   }
}
