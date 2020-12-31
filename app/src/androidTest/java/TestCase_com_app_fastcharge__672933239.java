import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_app_fastcharge__672933239 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      Context var4 = InstrumentationRegistry.getTargetContext();
      Object var5 = var4.getSystemService("activity");
      ActivityManager var6 = (ActivityManager)var5;
      String var1 = "android";
      var6.killBackgroundProcesses(var1);
   }

   public TestCase_com_app_fastcharge__672933239() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
