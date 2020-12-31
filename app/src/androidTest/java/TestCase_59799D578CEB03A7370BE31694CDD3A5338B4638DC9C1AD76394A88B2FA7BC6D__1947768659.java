import android.accounts.AccountAuthenticatorResponse;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_59799D578CEB03A7370BE31694CDD3A5338B4638DC9C1AD76394A88B2FA7BC6D__1947768659 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      Intent var4 = var3.getIntent();
      Parcelable var5 = var4.getParcelableExtra("accountAuthenticatorResponse");
      AccountAuthenticatorResponse var6 = (AccountAuthenticatorResponse)var5;
      Object var1 = EasyMock.createMock(Bundle.class);
      var6.onResult((Bundle)var1);
   }

   public TestCase_59799D578CEB03A7370BE31694CDD3A5338B4638DC9C1AD76394A88B2FA7BC6D__1947768659() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
