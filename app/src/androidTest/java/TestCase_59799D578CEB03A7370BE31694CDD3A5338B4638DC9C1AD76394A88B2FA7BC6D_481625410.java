import android.accounts.AccountAuthenticatorResponse;
import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_59799D578CEB03A7370BE31694CDD3A5338B4638DC9C1AD76394A88B2FA7BC6D_481625410 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      Intent var3 = var2.getIntent();
      Parcelable var4 = var3.getParcelableExtra("accountAuthenticatorResponse");
      AccountAuthenticatorResponse var5 = (AccountAuthenticatorResponse)var4;
      var5.onError(4, "canceled");
   }

   public TestCase_59799D578CEB03A7370BE31694CDD3A5338B4638DC9C1AD76394A88B2FA7BC6D_481625410() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
