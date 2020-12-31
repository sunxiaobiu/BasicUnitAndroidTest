import android.app.Activity;
import androidx.appcompat.app.AppCompatCallback;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5A426B6E4A1DFA30D693F480193F158DF448A2B7DA487ECA255094A2A681F481__391140285 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = new ActivityTestRule(Activity.class);
      Activity var2 = var1.getActivity();
      AppCompatDelegate var3 = AppCompatDelegate.create(var2, (AppCompatCallback)null);
      var3.invalidateOptionsMenu();
   }
}
