import android.app.Activity;
import androidx.core.app.ShareCompat.IntentBuilder;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5BD08A2A5502D276BF0A223E075BECBB5B8090FA57C2866750F9F138AC9580B0_903729585 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = new ActivityTestRule(Activity.class);
      Activity var3 = var2.getActivity();
      IntentBuilder var4 = IntentBuilder.from(var3);
      String var1 = "android";
      var4.addEmailTo(var1);
   }
}
