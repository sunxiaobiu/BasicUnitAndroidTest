import android.media.MediaExtractor;
import androidx.test.runner.AndroidJUnit4;
import java.io.FileDescriptor;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_cyberlink_actiondirector__1101761880 {
   @Test
   public void testCase() throws Exception {
      Object var6 = EasyMock.createMock(MediaExtractor.class);
      Object var1 = null;
      long var2 = 1L;
      long var4 = 1L;
      ((MediaExtractor)var6).setDataSource((FileDescriptor)var1, var2, var4);
   }
}
