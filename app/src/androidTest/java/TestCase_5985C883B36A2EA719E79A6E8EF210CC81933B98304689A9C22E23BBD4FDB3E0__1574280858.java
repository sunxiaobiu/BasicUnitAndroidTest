import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5985C883B36A2EA719E79A6E8EF210CC81933B98304689A9C22E23BBD4FDB3E0__1574280858 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Camera.class);
      Object var1 = EasyMock.createMock(SurfaceTexture.class);
      ((Camera)var2).setPreviewTexture((SurfaceTexture)var1);
   }
}
