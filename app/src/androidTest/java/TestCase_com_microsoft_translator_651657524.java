import android.hardware.Camera;
import android.hardware.Camera.PictureCallback;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_microsoft_translator_651657524 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(PictureCallback.class);
      byte[] var1 = new byte[1];
      Object var2 = EasyMock.createMock(Camera.class);
      ((PictureCallback)var3).onPictureTaken(var1, (Camera)var2);
   }
}
