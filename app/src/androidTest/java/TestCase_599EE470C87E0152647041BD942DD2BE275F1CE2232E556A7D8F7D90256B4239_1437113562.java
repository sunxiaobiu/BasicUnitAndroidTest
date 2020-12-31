import android.app.ActionBar;
import android.app.Activity;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_599EE470C87E0152647041BD942DD2BE275F1CE2232E556A7D8F7D90256B4239_1437113562 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = new ActivityTestRule(Activity.class);
      Activity var3 = var2.getActivity();
      ActionBar var4 = var3.getActionBar();
      byte var1 = 1;
      var4.setHomeActionContentDescription(var1);
   }
}
