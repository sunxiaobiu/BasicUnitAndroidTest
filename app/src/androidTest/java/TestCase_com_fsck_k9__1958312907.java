import android.app.Activity;
import android.app.FragmentManager;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_fsck_k9__1958312907 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      FragmentManager var4 = var3.getFragmentManager();
      byte var1 = 1;
      var4.popBackStackImmediate(var1, 1);
   }

   public TestCase_com_fsck_k9__1958312907() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
