import android.app.Activity;
import android.content.Intent;
import androidx.core.app.ShareCompat.IntentBuilder;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_206D5EB530BFBCD789CA8896D58B9E336B77F0FB0377EA2F12F0C85E02D27681__1441242524 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      var2 = (Activity)var2;
      IntentBuilder var3 = IntentBuilder.from(var2);
      Intent var4 = var3.getIntent();
   }

   public TestCase_206D5EB530BFBCD789CA8896D58B9E336B77F0FB0377EA2F12F0C85E02D27681__1441242524() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
