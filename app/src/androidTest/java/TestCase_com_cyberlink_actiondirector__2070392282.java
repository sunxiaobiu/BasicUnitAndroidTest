import android.media.MediaExtractor;
import androidx.test.runner.AndroidJUnit4;
import java.util.Map;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_cyberlink_actiondirector__2070392282 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(MediaExtractor.class);
      String var1 = "android";
      Object var2 = null;
      ((MediaExtractor)var3).setDataSource(var1, (Map)var2);
   }
}
