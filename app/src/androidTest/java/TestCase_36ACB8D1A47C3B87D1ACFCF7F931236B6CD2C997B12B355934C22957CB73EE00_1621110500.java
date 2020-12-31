import android.app.Activity;
import android.view.View;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import androidx.viewpager.widget.PagerTabStrip;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_36ACB8D1A47C3B87D1ACFCF7F931236B6CD2C997B12B355934C22957CB73EE00_1621110500 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      View var3 = var2.findViewById(2131296584);
      PagerTabStrip var4 = (PagerTabStrip)var3;
      var4.setDrawFullUnderline(false);
   }

   public TestCase_36ACB8D1A47C3B87D1ACFCF7F931236B6CD2C997B12B355934C22957CB73EE00_1621110500() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
