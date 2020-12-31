import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_28E9EAD2C4CE32FB24F6DBDA9B8711A8EF2B214A67EF477AE9D909C82D67055D__488204507 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      FragmentActivity var3 = (FragmentActivity)var2;
      Factory var4 = var3.getDefaultViewModelProviderFactory();
   }

   public TestCase_28E9EAD2C4CE32FB24F6DBDA9B8711A8EF2B214A67EF477AE9D909C82D67055D__488204507() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
