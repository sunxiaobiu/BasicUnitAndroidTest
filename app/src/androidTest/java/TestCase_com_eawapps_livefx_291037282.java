import android.hardware.Camera;
import android.hardware.Camera.PreviewCallback;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_eawapps_livefx_291037282 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(PreviewCallback.class);
      byte[] var1 = new byte[1];
      Object var2 = EasyMock.createMock(Camera.class);
      ((PreviewCallback)var3).onPreviewFrame(var1, (Camera)var2);
   }
}
