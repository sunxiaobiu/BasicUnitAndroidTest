import android.app.Activity;
import android.support.v4.app.ShareCompat.IntentBuilder;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ar_com_lichtmaier_leyes__255522763 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      IntentBuilder var3 = IntentBuilder.from(var2);
      var3 = var3.setType("text/plain");
   }

   public TestCase_ar_com_lichtmaier_leyes__255522763() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
