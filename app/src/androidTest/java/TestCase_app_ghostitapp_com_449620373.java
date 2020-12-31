import android.media.MediaExtractor;
import androidx.test.runner.AndroidJUnit4;
import java.nio.ByteBuffer;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_app_ghostitapp_com_449620373 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(MediaExtractor.class);
      Object var1 = null;
      ((MediaExtractor)var2).readSampleData((ByteBuffer)var1, 0);
   }
}
