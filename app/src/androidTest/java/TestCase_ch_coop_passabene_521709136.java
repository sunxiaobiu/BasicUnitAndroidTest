import android.app.Activity;
import android.media.AudioManager;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_coop_passabene_521709136 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = new ActivityTestRule(Activity.class);
      Activity var3 = var2.getActivity();
      Object var4 = var3.getSystemService("audio");
      AudioManager var5 = (AudioManager)var4;
      byte var1 = 1;
      var5.playSoundEffect(var1, 0.5F);
   }
}
