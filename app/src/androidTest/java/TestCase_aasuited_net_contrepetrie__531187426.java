import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aasuited_net_contrepetrie__531187426 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Uri.class);
      String var1 = DocumentsContract.getDocumentId((Uri)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
