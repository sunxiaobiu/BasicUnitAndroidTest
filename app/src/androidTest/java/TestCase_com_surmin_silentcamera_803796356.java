import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_surmin_silentcamera_803796356 {
   public static void testCase() throws Exception {
      boolean var0 = StreamConfigurationMap.isOutputSupportedFor(SurfaceTexture.class);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
