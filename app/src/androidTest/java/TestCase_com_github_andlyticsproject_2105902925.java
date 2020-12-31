import android.accounts.Account;
import android.content.ContentResolver;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_github_andlyticsproject_2105902925 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Account.class);
      boolean var1 = ContentResolver.getSyncAutomatically((Account)var0, "com.github.andlyticsproject");
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
