import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.os.Handler;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5B76129BAA788363EB398534E606A23C3A18777785412860E03472BDAFF591E6__481233323 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(SurfaceTexture.class);
      Object var1 = EasyMock.createMock(OnFrameAvailableListener.class);
      Object var2 = EasyMock.createMock(Handler.class);
      ((SurfaceTexture)var3).setOnFrameAvailableListener((OnFrameAvailableListener)var1, (Handler)var2);
   }
}
