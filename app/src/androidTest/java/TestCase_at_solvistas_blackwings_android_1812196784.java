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
public class TestCase_at_solvistas_blackwings_android_1812196784 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var4 = new ActivityTestRule(Activity.class);
      Activity var5 = var4.getActivity();
      AccountManager var6 = AccountManager.get(var5);
      String var1 = "android";
      Object var2 = EasyMock.createMock(Activity.class);
      Object var3 = null;
      var6.getAuthTokenByFeatures(var1, "Full access", (String[])null, (Activity)var2, (Bundle)null, (Bundle)null, (AccountManagerCallback)var3, (Handler)null);
   }
}
