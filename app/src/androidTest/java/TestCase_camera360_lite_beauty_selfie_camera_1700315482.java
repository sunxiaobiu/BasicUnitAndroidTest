import android.hardware.Camera.Parameters;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_camera360_lite_beauty_selfie_camera_1700315482 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Parameters.class);
      boolean var2 = ((Parameters)var1).isVideoSnapshotSupported();
   }
}
