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
public class TestCase_au_gov_casa_flightsafetyaustralia__1476082485 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      TransitionInflater var3 = TransitionInflater.from(var2);
      Transition var4 = var3.inflateTransition(17760257);
   }

   public TestCase_au_gov_casa_flightsafetyaustralia__1476082485() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
