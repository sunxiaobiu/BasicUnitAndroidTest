import android.app.Activity;
import android.support.v7.widget.ListPopupWindow;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_66FA67D1432CAC39C8AEFD7706005076A7674DCB7BC3A8BF5F905547CDB5DE74__379304934 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var1 = var2.getActivity();
      ListPopupWindow var3 = new ListPopupWindow(var1);
      byte var4 = 1;
      var3.setHeight(var4);
   }

   public TestCase_66FA67D1432CAC39C8AEFD7706005076A7674DCB7BC3A8BF5F905547CDB5DE74__379304934() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
