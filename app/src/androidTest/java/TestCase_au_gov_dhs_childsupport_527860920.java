import android.accounts.Account;
import android.accounts.AccountManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_gov_dhs_childsupport_527860920 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(AccountManager.class);
      Object var1 = EasyMock.createMock(Account.class);
      String var2 = "android";
      ((AccountManager)var3).setUserData((Account)var1, "deviceId", var2);
   }
}
