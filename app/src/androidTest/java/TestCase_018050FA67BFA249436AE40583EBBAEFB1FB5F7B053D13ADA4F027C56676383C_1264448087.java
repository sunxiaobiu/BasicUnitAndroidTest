import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_018050FA67BFA249436AE40583EBBAEFB1FB5F7B053D13ADA4F027C56676383C_1264448087 {
   public static void testCase() throws Exception {
      byte var0 = 1;
      Object var1 = EasyMock.createMock(CameraInfo.class);
      Camera.getCameraInfo(var0, (CameraInfo)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
