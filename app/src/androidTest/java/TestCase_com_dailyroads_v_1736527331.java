import android.content.ContentResolver;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_dailyroads_v_1736527331 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Uri.class);
      Object var1 = EasyMock.createMock(ContentResolver.class);
      Object var2 = EasyMock.createMock(Uri.class);
      Object var3 = EasyMock.createMock(Uri.class);
      DocumentsContract.moveDocument((ContentResolver)var1, (Uri)var0, (Uri)var2, (Uri)var3);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
