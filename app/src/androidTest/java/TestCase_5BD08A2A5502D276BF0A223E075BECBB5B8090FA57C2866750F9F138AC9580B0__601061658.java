import android.app.Activity;
import androidx.core.app.ShareCompat.IntentBuilder;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5BD08A2A5502D276BF0A223E075BECBB5B8090FA57C2866750F9F138AC9580B0__601061658 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = new ActivityTestRule(Activity.class);
      Activity var2 = var1.getActivity();
      IntentBuilder var3 = IntentBuilder.from(var2);
      var3 = var3.setType("message/rfc822");
   }
}
