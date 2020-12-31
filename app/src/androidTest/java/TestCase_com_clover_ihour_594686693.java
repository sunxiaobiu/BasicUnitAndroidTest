import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_clover_ihour_594686693 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var3 = this.mActivityRule;
      Activity var1 = var3.getActivity();
      RecyclerView var4 = new RecyclerView(var1);
      byte var5 = 1;
      byte var2 = 1;
      var4.measure(var5, var2);
   }

   public TestCase_com_clover_ihour_594686693() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
