import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_02723EE2F1D009B56CF234B40929A730ACC1D4A12D303EBC02F4812E3A2D01BA__1414040636 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Uri.class);
      String var1 = DocumentsContract.getTreeDocumentId((Uri)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
