import android.app.Activity;
import android.transition.Transition;
import android.transition.TransitionInflater;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_gov_casa_flightsafetyaustralia__1935046309 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var3 = this.mActivityRule;
      Activity var4 = var3.getActivity();
      TransitionInflater var5 = TransitionInflater.from(var4);
      Transition var6 = var5.inflateTransition(17760257);
      long var1 = var6.getDuration();
   }

   public TestCase_au_gov_casa_flightsafetyaustralia__1935046309() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
