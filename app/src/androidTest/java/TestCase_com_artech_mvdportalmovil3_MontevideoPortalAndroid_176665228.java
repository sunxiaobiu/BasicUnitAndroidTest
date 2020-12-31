import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_artech_mvdportalmovil3_MontevideoPortalAndroid_176665228 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = new ActivityTestRule(Activity.class);
      Activity var3 = var2.getActivity();
      AppCompatActivity var4 = (AppCompatActivity)var3;
      byte var1 = 1;
      var4.supportRequestWindowFeature(var1);
   }
}
