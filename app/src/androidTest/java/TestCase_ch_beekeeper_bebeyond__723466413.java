import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.app.Activity;
import android.os.Handler;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_beekeeper_bebeyond__723466413 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(AccountManager.class);
      Object var1 = EasyMock.createMock(Account.class);
      ((AccountManager)var2).removeAccount((Account)var1, (Activity)null, (AccountManagerCallback)null, (Handler)null);
   }
}
