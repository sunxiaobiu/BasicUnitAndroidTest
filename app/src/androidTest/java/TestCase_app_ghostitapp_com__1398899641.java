import android.media.MediaExtractor;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_app_ghostitapp_com__1398899641 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(MediaExtractor.class);
      byte var1 = 1;
      ((MediaExtractor)var2).getTrackFormat(var1);
   }
}
