import android.support.v4.provider.DocumentFile;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_asustor_aifoto__1610421844 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(DocumentFile.class);
      String var2 = ((DocumentFile)var1).getType();
   }
}
