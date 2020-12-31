import android.content.Context;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;
import android.provider.Contacts.People;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_cua_mb__1827005786 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      Object var1 = EasyMock.createMock(Uri.class);
      People.loadContactPhoto((Context)var0, (Uri)var1, 0, (Options)null);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
