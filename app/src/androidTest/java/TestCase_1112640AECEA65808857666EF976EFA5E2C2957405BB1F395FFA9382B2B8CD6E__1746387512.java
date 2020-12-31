import android.app.Activity;
import android.content.res.Resources;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_1112640AECEA65808857666EF976EFA5E2C2957405BB1F395FFA9382B2B8CD6E__1746387512 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      Resources var3 = var2.getResources();
   }

   public TestCase_1112640AECEA65808857666EF976EFA5E2C2957405BB1F395FFA9382B2B8CD6E__1746387512() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
