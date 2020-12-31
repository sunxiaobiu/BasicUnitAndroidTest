import android.app.Activity;
import android.media.AudioManager;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_ahmet_QuranLearnLite_1427943113 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var3 = this.mActivityRule;
      Activity var4 = var3.getActivity();
      Object var5 = var4.getSystemService("audio");
      AudioManager var6 = (AudioManager)var5;
      byte var1 = 1;
      byte var2 = 1;
      var6.adjustSuggestedStreamVolume(var1, var2, 21);
   }

   public TestCase_com_ahmet_QuranLearnLite_1427943113() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
