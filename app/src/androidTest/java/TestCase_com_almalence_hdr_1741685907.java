import android.hardware.Camera;
import android.hardware.Camera.PictureCallback;
import android.hardware.Camera.ShutterCallback;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_almalence_hdr_1741685907 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Camera.class);
      Object var1 = null;
      ((Camera)var2).takePicture((ShutterCallback)null, (PictureCallback)null, (PictureCallback)null, (PictureCallback)var1);
   }
}
