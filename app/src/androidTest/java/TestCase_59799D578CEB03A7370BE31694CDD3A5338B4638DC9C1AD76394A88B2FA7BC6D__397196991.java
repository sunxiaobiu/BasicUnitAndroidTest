import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_59799D578CEB03A7370BE31694CDD3A5338B4638DC9C1AD76394A88B2FA7BC6D__397196991 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      AccountManager var3 = AccountManager.get(var2);
      Object var1 = EasyMock.createMock(Account.class);
      var3.getUserData((Account)var1, "EXTRA_AUTH_REFRESH_TOKEN");
   }
}
