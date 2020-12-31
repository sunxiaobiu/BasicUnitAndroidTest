import android.content.ContentUris;
import android.net.Uri;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_au_gov_qld_deta_takeastand_854345535 {
   public static void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Uri.class);
      long var0 = ContentUris.parseId((Uri)var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
