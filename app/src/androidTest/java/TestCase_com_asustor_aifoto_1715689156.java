import android.net.Uri;
import android.support.v4.provider.DocumentFile;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_asustor_aifoto_1715689156 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(DocumentFile.class);
      Uri var2 = ((DocumentFile)var1).getUri();
   }
}
