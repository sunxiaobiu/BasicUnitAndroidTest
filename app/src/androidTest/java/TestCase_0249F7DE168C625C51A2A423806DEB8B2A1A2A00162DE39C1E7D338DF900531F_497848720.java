import android.app.Activity;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0249F7DE168C625C51A2A423806DEB8B2A1A2A00162DE39C1E7D338DF900531F_497848720 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      byte var1 = 1;
      var3.setContentView(var1);
   }

   public TestCase_0249F7DE168C625C51A2A423806DEB8B2A1A2A00162DE39C1E7D338DF900531F_497848720() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
