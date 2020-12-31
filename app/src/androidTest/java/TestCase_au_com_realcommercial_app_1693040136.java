import android.accounts.Account;
import android.content.ContentResolver;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_realcommercial_app_1693040136 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Account.class);
      boolean var1 = ContentResolver.isSyncPending((Account)var0, "au.com.realcommercial.app.provider");
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
