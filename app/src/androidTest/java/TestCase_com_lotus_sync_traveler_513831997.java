import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.app.Activity;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_lotus_sync_traveler_513831997 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = new ActivityTestRule(Activity.class);
      Activity var2 = var1.getActivity();
      Animator var3 = AnimatorInflater.loadAnimator(var2, 2130837504);
      var3 = var3.clone();
   }
}
