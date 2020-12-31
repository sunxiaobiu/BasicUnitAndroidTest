import android.app.Activity;
import android.app.FragmentManager;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_00F7DA3B1CCB438A32B1B9DB1CFCF12830ADF9BECCEEB8E2932FE0E7AA2E98FC_1400568557 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = new ActivityTestRule(Activity.class);
      Activity var2 = var1.getActivity();
      FragmentManager var3 = var2.getFragmentManager();
      var3.executePendingTransactions();
   }
}
