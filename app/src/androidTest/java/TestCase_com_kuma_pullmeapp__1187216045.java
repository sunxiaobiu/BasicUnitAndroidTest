import android.content.Context;
import android.net.Uri;
import android.provider.ContactsContract.QuickContact;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_kuma_pullmeapp__1187216045 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      Object var1 = null;
      Object var2 = EasyMock.createMock(Uri.class);
      QuickContact.showQuickContact((Context)var0, (View)var1, (Uri)var2, 1, (String[])null);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
