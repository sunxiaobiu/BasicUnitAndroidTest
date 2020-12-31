import android.app.Activity;
import android.app.UiModeManager;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_air_Lovepixelflashlightmobile_89448027 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = new ActivityTestRule(Activity.class);
      Activity var2 = var1.getActivity();
      Object var3 = var2.getSystemService("uimode");
      UiModeManager var4 = (UiModeManager)var3;
      int var5 = var4.getCurrentModeType();
   }
}
