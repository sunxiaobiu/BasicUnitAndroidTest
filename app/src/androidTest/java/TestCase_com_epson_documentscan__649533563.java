import android.app.Activity;
import android.app.FragmentManager;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_epson_documentscan__649533563 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = new ActivityTestRule(Activity.class);
      Activity var2 = var1.getActivity();
      FragmentManager var3 = var2.getFragmentManager();
      var3.invalidateOptionsMenu();
   }
}
