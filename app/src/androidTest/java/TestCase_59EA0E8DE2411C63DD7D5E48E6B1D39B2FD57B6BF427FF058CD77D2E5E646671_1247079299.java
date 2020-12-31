import android.app.Activity;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_59EA0E8DE2411C63DD7D5E48E6B1D39B2FD57B6BF427FF058CD77D2E5E646671_1247079299 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      View var3 = var2.findViewById(2131296360);
      DrawerLayout var4 = (DrawerLayout)var3;
      boolean var5 = var4.getFitsSystemWindows();
   }

   public TestCase_59EA0E8DE2411C63DD7D5E48E6B1D39B2FD57B6BF427FF058CD77D2E5E646671_1247079299() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
