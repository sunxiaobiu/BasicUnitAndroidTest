import android.content.ContentResolver;
import android.net.Uri;
import android.provider.Contacts.People;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5A252BA59BECC1D790AE6B1148FF17745B4727425FF17840429B8570038FD5F2_756700166 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(ContentResolver.class);
      Object var1 = EasyMock.createMock(Uri.class);
      People.openContactPhotoInputStream((ContentResolver)var0, (Uri)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
