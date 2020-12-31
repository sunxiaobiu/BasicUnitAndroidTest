import android.hardware.Camera;
import android.media.MediaRecorder;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_cua_mb__821027440 {
   @Test
   public void testCase() throws Exception {
      MediaRecorder var2 = new MediaRecorder();
      Object var1 = EasyMock.createMock(Camera.class);
      var2.setCamera((Camera)var1);
   }
}
