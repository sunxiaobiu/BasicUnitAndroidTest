import android.app.Activity;
import androidx.core.app.ShareCompat.IntentBuilder;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_206D5EB530BFBCD789CA8896D58B9E336B77F0FB0377EA2F12F0C85E02D27681_1916955278 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      var3 = (Activity)var3;
      IntentBuilder var4 = IntentBuilder.from(var3);
      Object var1 = null;
      var4.setChooserTitle((CharSequence)var1);
   }

   public TestCase_206D5EB530BFBCD789CA8896D58B9E336B77F0FB0377EA2F12F0C85E02D27681_1916955278() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
