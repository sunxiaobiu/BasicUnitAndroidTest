import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_android_service_one__1191732757 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var4 = new ActivityTestRule(Activity.class);
      Activity var5 = var4.getActivity();
      AccountManager var1 = AccountManager.get(var5);
      String var2 = "android";
      Object var3 = null;
      var1.addAccount(var2, "Banking AuthToken", (String[])null, (Bundle)null, var5, (AccountManagerCallback)var3, (Handler)null);
   }
}
