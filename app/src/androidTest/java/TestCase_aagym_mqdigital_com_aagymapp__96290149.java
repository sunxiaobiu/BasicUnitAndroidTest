import android.app.Activity;
import android.app.ProgressDialog;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aagym_mqdigital_com_aagymapp__96290149 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var1 = var2.getActivity();
      ProgressDialog var3 = new ProgressDialog(var1);
      String var4 = "android";
      var3.setTitle(var4);
   }

   public TestCase_aagym_mqdigital_com_aagymapp__96290149() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
