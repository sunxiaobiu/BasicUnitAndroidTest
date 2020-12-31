import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_00F7DA3B1CCB438A32B1B9DB1CFCF12830ADF9BECCEEB8E2932FE0E7AA2E98FC_397201403 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = new ActivityTestRule(Activity.class);
      Activity var2 = var1.getActivity();
      ActionBar var3 = var2.getActionBar();
      Context var4 = var3.getThemedContext();
   }
}
