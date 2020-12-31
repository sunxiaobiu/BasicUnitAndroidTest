import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.test.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0758A49CB1A80E521FF9BD600016AFF9FB212B458362852CF61C0A1F429BEF28_730184717 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      ActivityTestRule var1 = new ActivityTestRule(Activity.class);
      Activity var5 = var1.getActivity();
      AccountManager var4 = AccountManager.get(var3);
      Object var6 = EasyMock.createMock(Account.class);
      Object var2 = EasyMock.createMock(Bundle.class);
      var4.getAuthToken((Account)var6, "AdobeID access", (Bundle)var2, false, (AccountManagerCallback)null, (Handler)null);
   }
}
