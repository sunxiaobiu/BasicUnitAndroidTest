import android.support.v4.provider.DocumentFile;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_androvid_876868311 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(DocumentFile.class);
      long var1 = ((DocumentFile)var3).length();
   }
}
