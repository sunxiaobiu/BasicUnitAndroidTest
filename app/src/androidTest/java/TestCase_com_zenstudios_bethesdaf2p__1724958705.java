import android.app.Activity;
import android.os.PowerManager;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_zenstudios_bethesdaf2p__1724958705 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = new ActivityTestRule(Activity.class);
      Activity var2 = var1.getActivity();
      Object var3 = var2.getSystemService("power");
      PowerManager var4 = (PowerManager)var3;
      boolean var5 = var4.isSustainedPerformanceModeSupported();
   }
}
