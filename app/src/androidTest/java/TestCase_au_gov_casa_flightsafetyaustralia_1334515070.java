import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_gov_casa_flightsafetyaustralia_1334515070 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var4 = new ActivityTestRule(Activity.class);
      Activity var5 = var4.getActivity();
      AccountManager var1 = AccountManager.get(var5);
      Object var2 = EasyMock.createMock(Account.class);
      Object var3 = EasyMock.createMock(Bundle.class);
      var1.getAuthToken((Account)var2, "AdobeID access", (Bundle)var3, var5, (AccountManagerCallback)null, (Handler)null);
   }
}
