import android.media.MediaFormat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_ethnixhd_live_1330595205 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(MediaFormat.class);
      int var2 = ((MediaFormat)var1).getInteger("channel-count");
   }
}
