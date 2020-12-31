import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_beakerapps_qeek__667309020 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      FragmentManager var3 = var2.getFragmentManager();
      Fragment var4 = var3.findFragmentByTag("SearchActivityFragment");
      boolean var5 = var4.isHidden();
   }

   public TestCase_com_beakerapps_qeek__667309020() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
