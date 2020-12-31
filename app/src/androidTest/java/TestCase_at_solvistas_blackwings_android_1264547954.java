import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.content.Context;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_at_solvistas_blackwings_android_1264547954 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var4 = this.mActivityRule;
      Activity var5 = var4.getActivity();
      Context var6 = var5.getBaseContext();
      AccountManager var7 = AccountManager.get(var6);
      Object var1 = EasyMock.createMock(Account.class);
      String var2 = "android";
      String var3 = "android";
      var7.setAuthToken((Account)var1, var2, var3);
   }

   public TestCase_at_solvistas_blackwings_android_1264547954() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
