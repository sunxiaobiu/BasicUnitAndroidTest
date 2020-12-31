import android.content.Context;
import android.net.Uri;
import android.support.v4.provider.DocumentFile;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_brother_ptouch_designandprint__1601051248 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      Object var1 = EasyMock.createMock(Uri.class);
      DocumentFile.fromSingleUri((Context)var0, (Uri)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
