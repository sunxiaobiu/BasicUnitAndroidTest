import android.app.Activity;
import android.app.Notification.Builder;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_033513FFD5A4E35F5A808B3BC0B529B3509EF4166A50DE624C848C1A05838623_1853740317 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      Builder var1 = new Builder(var3);
      var1.setCategory("navigation");
   }

   public TestCase_033513FFD5A4E35F5A808B3BC0B529B3509EF4166A50DE624C848C1A05838623_1853740317() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
