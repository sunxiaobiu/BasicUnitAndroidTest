import android.app.Activity;
import android.app.admin.DevicePolicyManager;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_app_privacy_techinfo_1818703668 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      Object var3 = var2.getSystemService("device_policy");
      DevicePolicyManager var4 = (DevicePolicyManager)var3;
      var4.lockNow();
   }

   public TestCase_app_privacy_techinfo_1818703668() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
