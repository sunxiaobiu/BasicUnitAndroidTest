import android.content.ContentUris;
import android.net.Uri;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ac_ewha_web_manager__1134987670 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Uri.class);
      long var1 = 1L;
      ContentUris.withAppendedId((Uri)var0, var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
