import android.app.Activity;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_chinzilla_littlealchemist_google_271281433 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = new ActivityTestRule(Activity.class);
      Activity var2 = var1.getActivity();
      String var3 = var2.getPackageResourcePath();
   }
}
