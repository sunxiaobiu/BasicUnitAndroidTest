import android.app.Activity;
import android.app.ActivityManager;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_AppRocks_mobiledata_battery_saver__781807556 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      Object var4 = var3.getSystemService("activity");
      ActivityManager var5 = (ActivityManager)var4;
      byte var1 = 1;
      var5.moveTaskToFront(var1, 1);
   }

   public TestCase_com_AppRocks_mobiledata_battery_saver__781807556() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
