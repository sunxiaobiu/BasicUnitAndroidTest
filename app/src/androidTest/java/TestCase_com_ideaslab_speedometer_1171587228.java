import android.app.Activity;
import android.support.v7.app.AppCompatDialog;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_ideaslab_speedometer_1171587228 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var1 = var2.getActivity();
      AppCompatDialog var3 = new AppCompatDialog(var1);
      String var4 = "android";
      var3.setTitle(var4);
   }

   public TestCase_com_ideaslab_speedometer_1171587228() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
