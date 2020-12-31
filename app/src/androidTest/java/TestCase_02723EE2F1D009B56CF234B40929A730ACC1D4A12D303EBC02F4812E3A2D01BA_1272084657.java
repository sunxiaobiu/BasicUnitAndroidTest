import android.content.ContentResolver;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_02723EE2F1D009B56CF234B40929A730ACC1D4A12D303EBC02F4812E3A2D01BA_1272084657 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Uri.class);
      Object var1 = EasyMock.createMock(ContentResolver.class);
      String var2 = "android";
      String var3 = "android";
      DocumentsContract.createDocument((ContentResolver)var1, (Uri)var0, var2, var3);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
