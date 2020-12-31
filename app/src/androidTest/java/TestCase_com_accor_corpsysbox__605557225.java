import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_accor_corpsysbox__605557225 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      AccountManager var4 = AccountManager.get(var3);
      Object var1 = EasyMock.createMock(Account.class);
      Object var2 = EasyMock.createMock(Bundle.class);
      var4.updateCredentials((Account)var1, "adal.authtoken.type", (Bundle)var2, (Activity)null, (AccountManagerCallback)null, (Handler)null);
   }
}
