import android.app.Activity;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionSet;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0B9E12305336BCB6F6AEDA55E8128D616BF62E71CB3ACEB78D392D5974729ACA_340214468 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      TransitionInflater var3 = TransitionInflater.from(var2);
      Transition var4 = var3.inflateTransition(17760257);
      TransitionSet var5 = (TransitionSet)var4;
      var5.setDuration(300L);
   }

   public TestCase_0B9E12305336BCB6F6AEDA55E8128D616BF62E71CB3ACEB78D392D5974729ACA_340214468() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
