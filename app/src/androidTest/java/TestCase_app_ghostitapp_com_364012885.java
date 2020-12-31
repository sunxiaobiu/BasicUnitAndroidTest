import android.media.MediaFormat;
import androidx.test.runner.AndroidJUnit4;
import java.nio.ByteBuffer;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_app_ghostitapp_com_364012885 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(int.class);
      Object var1 = EasyMock.createMock(int.class);
      MediaFormat var3 = MediaFormat.createVideoFormat("video/avc", (int)var2, (int)var1);
      var1 = null;
      var3.setByteBuffer("csd-0", (ByteBuffer)var1);
   }
}
