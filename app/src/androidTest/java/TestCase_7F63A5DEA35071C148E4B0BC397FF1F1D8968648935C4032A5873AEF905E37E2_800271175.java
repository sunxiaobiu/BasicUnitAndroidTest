import android.content.Context;
import android.net.Uri;
import android.support.v4.provider.DocumentFile;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_7F63A5DEA35071C148E4B0BC397FF1F1D8968648935C4032A5873AEF905E37E2_800271175 {
   public static void testCase() throws Exception {
      Object var0 = null;
      Object var1 = EasyMock.createMock(Uri.class);
      DocumentFile.isDocumentUri((Context)var0, (Uri)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
