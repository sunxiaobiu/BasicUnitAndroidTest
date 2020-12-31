import android.app.Activity;
import android.view.View;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.OnPageChangeListener;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_06637E18A7DDD85E5F4B9553DB72C6CBD9952D00C5F54CB1CD2905E6010F4C95_950725990 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      View var4 = var3.findViewById(2131362342);
      ViewPager var5 = (ViewPager)var4;
      Object var1 = null;
      var5.addOnPageChangeListener((OnPageChangeListener)var1);
   }

   public TestCase_06637E18A7DDD85E5F4B9553DB72C6CBD9952D00C5F54CB1CD2905E6010F4C95_950725990() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
