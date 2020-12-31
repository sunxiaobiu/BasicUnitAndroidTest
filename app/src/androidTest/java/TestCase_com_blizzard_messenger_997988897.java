import android.app.Activity;
import android.transition.Slide;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.Transition.TransitionListener;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_blizzard_messenger_997988897 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      TransitionInflater var4 = TransitionInflater.from(var3);
      Transition var5 = var4.inflateTransition(2131886080);
      Slide var6 = (Slide)var5;
      Object var1 = null;
      var6.addListener((TransitionListener)var1);
   }

   public TestCase_com_blizzard_messenger_997988897() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
