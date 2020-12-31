import android.content.ContentResolver;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_asus_filemanager_1316974089 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Uri.class);
      Object var1 = EasyMock.createMock(ContentResolver.class);
      String var2 = "android";
      DocumentsContract.renameDocument((ContentResolver)var1, (Uri)var0, var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
