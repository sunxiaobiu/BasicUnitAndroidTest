import android.app.Activity;
import android.view.View;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import androidx.viewpager.widget.ViewPager;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_6371BFBD26D1494E8675D9105338FDF9C78FE06ACBAA214038DA181719E00E9D_1254348274 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      View var3 = var2.findViewById(2131362457);
      ViewPager var4 = (ViewPager)var3;
      var4.clearOnPageChangeListeners();
   }

   public TestCase_6371BFBD26D1494E8675D9105338FDF9C78FE06ACBAA214038DA181719E00E9D_1254348274() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
