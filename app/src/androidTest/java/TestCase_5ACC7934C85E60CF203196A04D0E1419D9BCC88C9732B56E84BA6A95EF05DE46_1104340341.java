import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.AppTask;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5ACC7934C85E60CF203196A04D0E1419D9BCC88C9732B56E84BA6A95EF05DE46_1104340341 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      Object var4 = var3.getSystemService("activity");
      ActivityManager var5 = (ActivityManager)var4;
      List var6 = var5.getAppTasks();
      var4 = var6.get(0);
      AppTask var7 = (AppTask)var4;
      boolean var1 = true;
      var7.setExcludeFromRecents(var1);
   }

   public TestCase_5ACC7934C85E60CF203196A04D0E1419D9BCC88C9732B56E84BA6A95EF05DE46_1104340341() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
