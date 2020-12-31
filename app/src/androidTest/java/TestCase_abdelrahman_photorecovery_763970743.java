import android.content.ContentResolver;
import android.net.Uri;
import android.provider.ContactsContract.Contacts;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_photorecovery_763970743 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(ContentResolver.class);
      Object var1 = EasyMock.createMock(Uri.class);
      Contacts.openContactPhotoInputStream((ContentResolver)var0, (Uri)var1, true);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
