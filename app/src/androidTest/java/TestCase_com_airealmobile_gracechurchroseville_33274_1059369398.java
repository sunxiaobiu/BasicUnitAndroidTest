import android.app.Activity;
import android.support.design.widget.TabLayout;
import android.support.design.widget.TabLayout.Tab;
import android.view.View;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_airealmobile_gracechurchroseville_33274_1059369398 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      View var3 = var2.findViewById(2131624428);
      TabLayout var4 = (TabLayout)var3;
      Tab var5 = var4.newTab();
      var5.setCustomView(2130968686);
   }

   public TestCase_com_airealmobile_gracechurchroseville_33274_1059369398() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
