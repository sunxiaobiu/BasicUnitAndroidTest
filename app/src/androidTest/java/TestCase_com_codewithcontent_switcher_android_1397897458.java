import android.app.ActionBar;
import android.app.Activity;
import android.app.ActionBar.Tab;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_codewithcontent_switcher_android_1397897458 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      ActionBar var4 = var3.getActionBar();
      Tab var5 = var4.newTab();
      byte var1 = 1;
      var5.setIcon(var1);
   }

   public TestCase_com_codewithcontent_switcher_android_1397897458() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
