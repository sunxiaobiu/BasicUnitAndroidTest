import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_dcpetitions_mobile_iphone_1409579360 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var3 = new ActivityTestRule(Activity.class);
      Activity var4 = var3.getActivity();
      FragmentManager var5 = var4.getFragmentManager();
      FragmentTransaction var6 = var5.beginTransaction();
      byte var1 = 1;
      Object var2 = null;
      var6.add(var1, (Fragment)var2);
   }
}
