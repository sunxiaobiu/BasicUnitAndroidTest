import android.app.Activity;
import android.support.v4.app.ShareCompat.IntentBuilder;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_chuchutv_android__133744753 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = new ActivityTestRule(Activity.class);
      Activity var3 = var2.getActivity();
      IntentBuilder var4 = IntentBuilder.from(var3);
      String var1 = "android";
      var4.addEmailTo(var1);
   }
}
