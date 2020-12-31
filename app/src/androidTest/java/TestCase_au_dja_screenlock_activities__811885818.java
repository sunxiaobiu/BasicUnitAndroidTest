import android.app.Activity;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_dja_screenlock_activities__811885818 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      Object var4 = var3.getSystemService("device_policy");
      DevicePolicyManager var5 = (DevicePolicyManager)var4;
      Object var1 = EasyMock.createMock(ComponentName.class);
      var5.hasGrantedPolicy((ComponentName)var1, 4);
   }

   public TestCase_au_dja_screenlock_activities__811885818() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
