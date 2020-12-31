import android.content.ContentProviderOperation;
import android.content.ContentProviderOperation.Builder;
import android.net.Uri;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_cua_mb_835022884 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Uri.class);
      Builder var1 = ContentProviderOperation.newInsert((Uri)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
