import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_asus_filemanager_1753673787 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var4 = this.mActivityRule;
      Activity var5 = var4.getActivity();
      AccountManager var1 = AccountManager.get(var5);
      Object var2 = EasyMock.createMock(Account.class);
      Object var3 = null;
      var1.confirmCredentials((Account)var2, (Bundle)null, var5, (AccountManagerCallback)var3, (Handler)null);
   }

   public TestCase_com_asus_filemanager_1753673787() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
