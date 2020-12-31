import android.app.Activity;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_59967F61C5E3823924CCAEC45906A9258CD026BAB1C8F1DBC82D6EFCACEC74AE__935967338 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      Builder var1 = new Builder(var3);
      var1.setMessage(2131689570);
   }

   public TestCase_59967F61C5E3823924CCAEC45906A9258CD026BAB1C8F1DBC82D6EFCACEC74AE__935967338() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
