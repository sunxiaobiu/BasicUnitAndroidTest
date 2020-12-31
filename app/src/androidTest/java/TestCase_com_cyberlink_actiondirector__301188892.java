import android.content.Context;
import android.media.MediaExtractor;
import android.net.Uri;
import androidx.test.runner.AndroidJUnit4;
import java.util.Map;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_cyberlink_actiondirector__301188892 {
   @Test
   public void testCase() throws Exception {
      Object var4 = EasyMock.createMock(MediaExtractor.class);
      Object var1 = EasyMock.createMock(Context.class);
      Object var2 = EasyMock.createMock(Uri.class);
      Object var3 = null;
      ((MediaExtractor)var4).setDataSource((Context)var1, (Uri)var2, (Map)var3);
   }
}
