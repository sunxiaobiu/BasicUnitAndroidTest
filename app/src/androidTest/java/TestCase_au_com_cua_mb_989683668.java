import android.content.ContentResolver;
import android.content.ContentValues;
import android.provider.Contacts.People;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_cua_mb_989683668 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(ContentResolver.class);
      Object var1 = EasyMock.createMock(ContentValues.class);
      People.createPersonInMyContactsGroup((ContentResolver)var0, (ContentValues)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
