import android.hardware.Camera.Parameters;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_camera360_lite_beauty_selfie_camera_1644846613 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Parameters.class);
      int[] var1 = new int[1];
      ((Parameters)var2).getPreviewFpsRange(var1);
   }
}
