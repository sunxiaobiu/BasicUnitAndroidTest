import android.app.Activity;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_appfreeislamic_AbdulbasitwithEnglishMp3_1016208258 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      Resources var4 = var3.getResources();
      TypedArray var5 = var4.obtainTypedArray(2130903050);
      byte var1 = 1;
      var5.getResourceId(var1, 0);
   }

   public TestCase_ae_appfreeislamic_AbdulbasitwithEnglishMp3_1016208258() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
