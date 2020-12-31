import android.media.MediaFormat;
import androidx.test.runner.AndroidJUnit4;
import java.nio.ByteBuffer;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_cyberlink_actiondirector_112062923 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(MediaFormat.class);
      ByteBuffer var2 = ((MediaFormat)var1).getByteBuffer("csd-0");
   }
}
