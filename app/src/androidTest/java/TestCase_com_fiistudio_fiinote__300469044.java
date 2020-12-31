import android.content.ClipDescription;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_fiistudio_fiinote__300469044 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(ClipDescription.class);
      String[] var2 = ((ClipDescription)var1).filterMimeTypes("text/html");
   }
}
