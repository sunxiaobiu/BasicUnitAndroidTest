import android.app.Activity;
import android.view.MenuInflater;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_123445977874787EAC60F260330F2424519CE78B68BEE8DCF399BE18F4E73443_1619543382 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      MenuInflater var3 = var2.getMenuInflater();
   }

   public TestCase_123445977874787EAC60F260330F2424519CE78B68BEE8DCF399BE18F4E73443_1619543382() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
