import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_alensw_PicFolder_904743224 {
   public static void testCase() throws Exception {
      String var0 = "android";
      Uri var1 = DocumentsContract.buildTreeDocumentUri("com.android.externalstorage.documents", var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
