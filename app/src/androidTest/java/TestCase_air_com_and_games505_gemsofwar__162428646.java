import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_com_and_games505_gemsofwar__162428646 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = new ActivityTestRule(Activity.class);
      Activity var3 = var2.getActivity();
      FragmentManager var4 = var3.getFragmentManager();
      FragmentTransaction var5 = var4.beginTransaction();
      byte var1 = 1;
      var5.setCustomAnimations(var1, 0);
   }
}
