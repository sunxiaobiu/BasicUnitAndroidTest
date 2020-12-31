import android.hardware.camera2.params.ColorSpaceTransform;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_camera360_lite_beauty_selfie_camera_1901568645 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(ColorSpaceTransform.class);
      int[] var1 = new int[1];
      ((ColorSpaceTransform)var2).copyElements(var1, 0);
   }
}
