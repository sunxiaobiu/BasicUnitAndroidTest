import android.app.ActionBar;
import android.app.Activity;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_toyota_dashcamviewer__401923443 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      ActionBar var3 = var2.getActionBar();
      var3.setDisplayOptions(16);
   }

   public TestCase_au_com_toyota_dashcamviewer__401923443() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
