import android.app.Activity;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_01D40EE975431F28464DB03D697049FF598AC9E5EB466D3F21947ED896B3B883_2142830529 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      Builder var1 = new Builder(var3);
      var1 = var1.setTitle(2131689512);
   }

   public TestCase_01D40EE975431F28464DB03D697049FF598AC9E5EB466D3F21947ED896B3B883_2142830529() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
