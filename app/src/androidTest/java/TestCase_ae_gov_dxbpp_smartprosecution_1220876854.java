import android.app.Activity;
import android.content.Context;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_dxbpp_smartprosecution_1220876854 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      Context var3 = var2.getBaseContext();
      int var4 = var3.getColor(2131492883);
   }

   public TestCase_ae_gov_dxbpp_smartprosecution_1220876854() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
