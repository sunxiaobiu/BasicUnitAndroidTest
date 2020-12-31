import android.app.Activity;
import android.net.Uri;
import android.support.v4.app.ShareCompat.IntentReader;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_bravetheskies_ghostracer_382815718 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      IntentReader var3 = IntentReader.from(var2);
      Uri var4 = var3.getStream();
   }

   public TestCase_com_bravetheskies_ghostracer_382815718() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
