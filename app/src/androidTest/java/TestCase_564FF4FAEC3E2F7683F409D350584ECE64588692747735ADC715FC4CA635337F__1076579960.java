import android.app.Activity;
import android.media.RingtoneManager;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_564FF4FAEC3E2F7683F409D350584ECE64588692747735ADC715FC4CA635337F__1076579960 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      RingtoneManager var1 = new RingtoneManager(var3);
      var1.stopPreviousRingtone();
   }

   public TestCase_564FF4FAEC3E2F7683F409D350584ECE64588692747735ADC715FC4CA635337F__1076579960() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
