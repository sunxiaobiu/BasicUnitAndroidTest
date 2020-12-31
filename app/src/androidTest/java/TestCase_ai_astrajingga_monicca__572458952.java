import android.app.Activity;
import android.support.v4.view.ViewPager;
import android.view.View;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ai_astrajingga_monicca__572458952 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var3 = this.mActivityRule;
      Activity var4 = var3.getActivity();
      View var5 = var4.findViewById(2131624148);
      ViewPager var6 = (ViewPager)var5;
      byte var1 = 1;
      byte var2 = 1;
      var6.setPadding(var1, 0, var2, 0);
   }

   public TestCase_ai_astrajingga_monicca__572458952() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
