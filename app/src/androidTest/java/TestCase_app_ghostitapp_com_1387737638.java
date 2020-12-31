import android.media.MediaExtractor;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_app_ghostitapp_com_1387737638 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(MediaExtractor.class);
      long var1 = ((MediaExtractor)var3).getSampleTime();
   }
}
