import android.content.ContentResolver;
import android.net.Uri;
import android.provider.ContactsContract.Contacts;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_app_medicalid_free__952440315 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Uri.class);
      Object var1 = EasyMock.createMock(ContentResolver.class);
      Contacts.lookupContact((ContentResolver)var1, (Uri)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
