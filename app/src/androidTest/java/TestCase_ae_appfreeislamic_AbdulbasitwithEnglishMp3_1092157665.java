import android.app.Activity;
import android.content.Intent;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_appfreeislamic_AbdulbasitwithEnglishMp3_1092157665 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      Intent var3 = var2.getIntent();
      boolean var4 = var3.hasCategory("android.intent.category.LAUNCHER");
   }

   public TestCase_ae_appfreeislamic_AbdulbasitwithEnglishMp3_1092157665() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
