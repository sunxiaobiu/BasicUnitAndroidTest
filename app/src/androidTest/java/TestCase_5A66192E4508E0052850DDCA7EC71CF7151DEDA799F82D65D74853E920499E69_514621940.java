import android.app.Activity;
import android.app.LoaderManager;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5A66192E4508E0052850DDCA7EC71CF7151DEDA799F82D65D74853E920499E69_514621940 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      LoaderManager var3 = var2.getLoaderManager();
   }

   public TestCase_5A66192E4508E0052850DDCA7EC71CF7151DEDA799F82D65D74853E920499E69_514621940() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
