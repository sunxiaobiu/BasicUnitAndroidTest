import android.content.ClipData;
import android.content.ContentResolver;
import android.net.Uri;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_cm_confide_android__92342560 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(ContentResolver.class);
      Object var1 = EasyMock.createMock(Uri.class);
      ClipData.newUri((ContentResolver)var0, "A photo", (Uri)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
