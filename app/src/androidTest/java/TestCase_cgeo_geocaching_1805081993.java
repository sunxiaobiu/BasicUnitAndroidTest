import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_cgeo_geocaching_1805081993 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = new ActivityTestRule(Activity.class);
      Activity var2 = var1.getActivity();
      ActionBarActivity var3 = (ActionBarActivity)var2;
      var3.supportInvalidateOptionsMenu();
   }
}
