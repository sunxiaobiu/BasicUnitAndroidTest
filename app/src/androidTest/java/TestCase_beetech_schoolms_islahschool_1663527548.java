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
public class TestCase_beetech_schoolms_islahschool_1663527548 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      View var4 = var3.findViewById(2131558594);
      TabLayout var5 = (TabLayout)var4;
      Tab var6 = var5.newTab();
      String var1 = "android";
      var6.setTag(var1);
   }

   public TestCase_beetech_schoolms_islahschool_1663527548() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
