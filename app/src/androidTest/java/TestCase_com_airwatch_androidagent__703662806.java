import android.app.Activity;
import android.app.ActivityManager;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_airwatch_androidagent__703662806 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = new ActivityTestRule(Activity.class);
      Activity var2 = var1.getActivity();
      Object var3 = var2.getSystemService("activity");
      ActivityManager var4 = (ActivityManager)var3;
      int var5 = var4.getLockTaskModeState();
   }
}
