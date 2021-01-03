import android.app.Activity;
import android.support.design.widget.NavigationView;
import android.view.View;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_szhp__1364331489 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      View var4 = var3.findViewById(2131230903);
      NavigationView var5 = (NavigationView)var4;
      Object var1 = null;
      var5.postDelayed((Runnable)(new Runnable() {public void run() {}}), 500L);
   }

   public TestCase_ae_gov_szhp__1364331489() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
