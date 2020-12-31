import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_018050FA67BFA249436AE40583EBBAEFB1FB5F7B053D13ADA4F027C56676383C_1028932518 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      FragmentManager var4 = var3.getFragmentManager();
      FragmentTransaction var5 = var4.beginTransaction();
      Object var1 = null;
      var5.replace(16908290, (Fragment)var1);
   }

   public TestCase_018050FA67BFA249436AE40583EBBAEFB1FB5F7B053D13ADA4F027C56676383C_1028932518() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
