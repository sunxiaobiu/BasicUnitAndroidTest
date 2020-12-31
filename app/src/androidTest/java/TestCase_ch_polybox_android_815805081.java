import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_polybox_android_815805081 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      AccountManager var4 = AccountManager.get(var3);
      String var1 = "android";
      Object var2 = EasyMock.createMock(Account.class);
      var4.blockingGetAuthToken((Account)var2, var1, false);
   }
}
